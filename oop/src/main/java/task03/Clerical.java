package task03;

public abstract class Clerical {
    protected int cost;
    protected String name;

    public int getCost() {return cost;}
    public String getName() {return name;}


    void takeToClerk(Clerk clerk) {
        clerk.addItem(this);
    }

    abstract void displayAllFields();

}
