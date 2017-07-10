package task04;

import task03.*;
import java.util.Comparator;

public class Novice extends Clerk{

    public Novice() {
        Drawing firstPen = new Drawing("Pen", "blue", 150);
        Drawing secondPen = new Drawing("Pen", "blue", 100);
        Drawing pencil = new Drawing("Pencil", "usual", 20);
        Paper notepad = new Paper("Notepad", 20, "yellow", 20);
        Eraser eraser = new Eraser("Eraser", 20);
        this.addItem(firstPen);
        this.addItem(secondPen);
        this.addItem(pencil);
        this.addItem(notepad);
        this.addItem(eraser);
    }

    public void sortByName(){
        this.getWorkplace().sort(Comparator.comparing(Stationery::getName));
    }
    public void sortByCost() {
        this.getWorkplace().sort(Comparator.comparing(Stationery::getCost));
    }

    public void sortByCostAndName() {
        this.getWorkplace().sort(Comparator.comparing(Stationery::getCost).thenComparing(Stationery::getName));
    }
}
