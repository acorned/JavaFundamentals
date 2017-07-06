package task03;


/**
 * Created by acorned on 06.07.17.
 */
public abstract class Clerical {
    int cost;
    String name;

    public int getCost() {return cost;}
    public String getName() {return name;}


    void takeToClerk(Clerk clerk) {
        clerk.addItem(this);
    }

    abstract void displayAllFields();

}
