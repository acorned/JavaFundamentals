package task03;

public class Eraser extends Stationery {
    private int wasteInPercents;

    public Eraser(String name, int cost){
        super(name, cost);
        this.wasteInPercents = 0;
    }

    public void use(){
        wasteInPercents++;
    }

    public boolean isUsable() {return wasteInPercents < 100;}

    @Override
    public void displayAllFields() {
        System.out.println("name = " + getName());
        System.out.println("waste = " + wasteInPercents);
        System.out.println("cost = " + getCost());

    }
}
