package program17_carpetcostcalculator;

public class Program2_Carpet {

    private double cost;

    public Program2_Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return cost;
    }
}
