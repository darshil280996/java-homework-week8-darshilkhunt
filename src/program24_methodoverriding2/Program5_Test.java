package program24_methodoverriding2;

public class Program5_Test {

    public static void main(String[] args) {
        Program2_SBI s = new Program2_SBI();
        Program3_ICICI i = new Program3_ICICI();
        Program4_AXIS a = new Program4_AXIS();

        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}
