package task03;

public abstract class Clerical {
    private int cost;
    private String name;

    Clerical(int cost, String name){
        this.cost = cost;
        this.name = name;
    }

    public int getCost() {return cost;}
    public String getName() {return name;}


    void takeToClerk(Clerk clerk) {
        clerk.addItem(this);
    }

    abstract void displayAllFields();

}
