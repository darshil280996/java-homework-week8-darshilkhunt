package program23_methodoverriding;

public class Program2_Bike2 extends Program1_Vehicle {

    // Defining the same method as in the parent class and overriding it
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Program2_Bike2 obj = new Program2_Bike2(); // creating an object
        obj.run(); // Calling overridden method
    }
}
