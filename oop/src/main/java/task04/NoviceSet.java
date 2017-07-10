package task04;

import task03.*;
import java.util.Comparator;

public class NoviceSet {

    
    static private Clerk noviceSet = new Clerk();

    public static void setNoviceSet () {
        Drawing fisrtPen = new Drawing("Pen", "blue", 100);
        Drawing secondPen = new Drawing("Pen", "blue", 150);
        Drawing pencil = new Drawing("Pencil", "usual", 20);
        Paper notepad = new Paper("Notepad", 20, "yellow", 120);
        Eraser eraser = new Eraser("Eraser", 15);
        noviceSet.addItem(fisrtPen);
        noviceSet.addItem(secondPen);
        noviceSet.addItem(pencil);
        noviceSet.addItem(notepad);
        noviceSet.addItem(eraser);

    }
    public Clerk getNoviceSet(){
        return noviceSet;
    }
    public static void setSortedByName(){
        noviceSet.getWorkplace().sort(Comparator.comparing(Stationery::getName));
    }
}
