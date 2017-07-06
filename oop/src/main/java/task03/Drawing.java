package task03;

/**
 * Created by acorned on 06.07.17.
 */
public class Drawing extends Clerical {
    private int inkLevel;
    final String color;

    public Drawing(String name, String color, int cost){
        this.color = color;
        this.name = name;
        this.cost = cost;
        this.inkLevel = 10;
    }
    public boolean isEmpty(){
        return inkLevel <= 0;
    }

    public void use(){
        inkLevel--;
    }
}
