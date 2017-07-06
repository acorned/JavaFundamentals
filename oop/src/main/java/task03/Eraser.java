package task03;

/**
 * Created by Александр on 06/07/2017.
 */
public class Eraser extends Stationery {
    private int wasteInPercents;

    Eraser(String name, int cost){
        super(name, cost);
        this.wasteInPercents = 0;
    }

    public void use(){
        wasteInPercents++;
    }

    public boolean isUsable() {return wasteInPercents < 100;}

    @Override
    void displayAllFields() {
        System.out.println("name = " + getName());
        System.out.println("waste = " + wasteInPercents);
        System.out.println("cost = " + getCost());

    }
}
