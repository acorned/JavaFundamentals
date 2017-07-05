package task03;

/**
 * Created by acorned on 06.07.17.
 */
public interface Writable extends Clerical {
    int numberOfPages;
    String paperColor;

    int getNumberOfPages();
    String getPaperColor();

}
