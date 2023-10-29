package program20_poolarea;

public class Program2_Cuboid extends Program1_Rectangle {

    private double height;

    public Program2_Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
