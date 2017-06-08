package javase01.t06;

/**
 * Created by Александр on 06/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Main");
        Note notepad = new Note();
        NoteRecord record = new NoteRecord("Title", "Some text to write");
        NoteRecord record2 = new NoteRecord("Other Title", "Some another text");
        NoteRecord record3 = new NoteRecord("", "Text without title");
        notepad.addRecord(record);
        notepad.addRecord(record2);
        notepad.addRecord(record3);
        notepad.printRecords();

    }
}
