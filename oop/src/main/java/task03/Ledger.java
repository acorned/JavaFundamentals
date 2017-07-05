package task03;

/**
 * Created by acorned on 06.07.17.
 */
public class Ledger implements Writable {
    private int cost;
    private int numberOfPages;
    private String name;
    private String paperColor;

    Ledger(int cost, int numberOfPages, String name, String paperColor) {
        this.cost = cost;
        this.numberOfPages = numberOfPages;
        this.name = name;
        this.paperColor = paperColor;
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    @Override
    public String getPaperColor() {
        return this.paperColor;
    }

    void haveChecked(){
        System.out.println("Ledger has checked");
    }
}
