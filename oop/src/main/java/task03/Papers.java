package task03;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by acorned on 06.07.17.
 */
public class Papers extends Clerical {
    private final int numberOfPages;
    private final String paperColor;
    private List<String> content = new LinkedList<>();

    public Papers(String name, int numberOfPages, String paperColor, int cost){
        super(cost, name);
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
