package task03;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by acorned on 06.07.17.
 */
public class Paper extends Stationery {
    private final int numberOfPages;
    private final String paperColor;
    private List<String> content = new LinkedList<>();

    public Paper(String name, int numberOfPages, String paperColor, int cost){
        super(name, cost);
        this.numberOfPages = numberOfPages;
        this.paperColor = paperColor;

    }

    public String writeText(String text, Drawing device){
        if (!device.isEmpty()) {
            device.use();
            content.add(text);
            return text;
        }
        else return "Writing device is empty, try another one";

    }

    public String erasureText(int index, Eraser eraser){
        if (eraser.isUsable()) {
            eraser.use();
            return content.remove(index);
        }
        return "Can't erase, replace the eraser.";
    }

    public void showContent() {
        for (String item: content) {
            System.out.println(item);
        }
    }

    @Override
    void displayAllFields(){
        System.out.println(numberOfPages);
        System.out.println(paperColor);
        showContent();
    }

}
