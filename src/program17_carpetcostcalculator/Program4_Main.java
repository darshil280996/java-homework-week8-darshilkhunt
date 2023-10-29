package program17_carpetcostcalculator;

public class Program4_Main {

    public static void main(String[] args) {
        Program2_Carpet carpet = new Program2_Carpet(3.5);
        Program1_Floor floor = new Program1_Floor(2.75, 4.0);
        Program3_Calculator calculator = new Program3_Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        carpet = new Program2_Carpet(1.5);
        floor = new Program1_Floor(5.4, 4.5);
        calculator = new Program3_Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
