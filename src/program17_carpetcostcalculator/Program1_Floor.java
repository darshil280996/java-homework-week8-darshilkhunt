package program17_carpetcostcalculator;

public class Program1_Floor {

    private double width;
    private double length;

    public Program1_Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getArea() {
        return width * length;

    }
}
