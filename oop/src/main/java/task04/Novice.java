package task04;

import task03.*;
import java.util.Comparator;

public class Novice extends Clerk{

    public Novice() {
        Drawing fisrtPen = new Drawing("Pen", "blue", 100);
        Drawing secondPen = new Drawing("Pen", "blue", 150);
        Drawing pencil = new Drawing("Pencil", "usual", 20);
        Paper notepad = new Paper("Notepad", 20, "yellow", 120);
        Eraser eraser = new Eraser("Eraser", 15);
        this.addItem(fisrtPen);
        this.addItem(secondPen);
        this.addItem(pencil);
        this.addItem(notepad);
        this.addItem(eraser);
    }

    public static void setSortedByName(){
        //this.getWorkplace().sort(Comparator.comparing(Stationery::getName));
    }
}
