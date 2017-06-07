package javase01.t06;

/**
 * Created by Александр on 06/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Main");
        Note notepad = new Note(0, new NoteRecord("Title", "Some text"));
        System.out.println(notepad.getNotes()[0].text);

    }
}
