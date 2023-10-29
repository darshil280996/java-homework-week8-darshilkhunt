package program17_carpetcostcalculator;

public class Program3_Calculator {

    private Program1_Floor floor;

    private Program2_Carpet carpet;

    public Program3_Calculator(Program1_Floor floor, Program2_Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
