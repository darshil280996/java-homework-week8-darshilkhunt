package program21_abstractexample;

public class Program4_TestAbstraction {

    public static void main(String[] args) {
        Program1_Shape s = new Program3_Circle(); // In a real scenario, an object is provided through a method, e.g., getShape() method
        s.draw();
    }
}
