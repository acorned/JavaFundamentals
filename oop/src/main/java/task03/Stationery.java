package task03;

public abstract class Stationery {
    private int cost;
    private String name;

    Stationery(String name, int cost){
        this.cost = cost;
        this.name = name;
    }

    public int getCost() {return cost;}
    public String getName() {return name;}


    void takeToClerk(Clerk clerk) {
        clerk.addItem(this);
    }

    public abstract void displayAllFields();

}
