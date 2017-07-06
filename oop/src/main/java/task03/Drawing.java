package task03;

/**
 * Created by acorned on 06.07.17.
 */
public class Drawing extends Stationery {
    private int inkLevel;
    private final String color;

    public Drawing(String name, String color, int cost){
        super(cost, name);
        this.color = color;
        this.inkLevel = 10;
    }
    public boolean isEmpty(){
        return inkLevel <= 0;
    }

    public void use(){
        inkLevel--;
    }

    void displayAllFields(){
        System.out.println("name = " + getName());
        System.out.println("color = " + color);
        System.out.println("ink level = " + inkLevel);
        System.out.println("cost = " + getCost());

    }
}
