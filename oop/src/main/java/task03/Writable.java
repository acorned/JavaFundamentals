package task03;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by acorned on 06.07.17.
 */
public class Writable extends Clerical {
    final int numberOfPages;
    final String paperColor;
    private List<String> content = new LinkedList<>();

    public Writable(String name, int numberOfPages, String paperColor, int cost){
        this.name = name;
        this.cost = cost;
        this.numberOfPages = numberOfPages;
        this.paperColor = paperColor;

    }

    public String writeText(String text, Drawing draw){
        if (!draw.isEmpty()) {
            draw.use();
            content.add(text);
            return text;
        }
        else return "Draw is empty, try another one";

    }
    public void showContent() {
        for (String item: content) {
            System.out.println(item);
        }
    }

    void displayAllFields(){
        System.out.println(numberOfPages);
        System.out.println(paperColor);
        showContent();
    }

}
