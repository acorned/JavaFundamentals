package javase01.t06;

/**
 * Created by Александр on 06/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        Note notepad = new Note();
        NoteRecord record = new NoteRecord("Title", "Some text to write");
        notepad.addRecord(record);
        record = new NoteRecord("Other Title", "Some another text");
        notepad.addRecord(record);
        record = new NoteRecord("", "Text without title");
        notepad.addRecord(record);

        notepad.printRecords();
        notepad.removeRecordByIndex(1);
        notepad.printRecords();
        try{
            notepad.removeRecordByIndex(1);
        } catch(IndexOutOfBoundsException e)

        {
            System.err.println("FAILED. Wrong index");
        } catch(NoEntryException e)

        {
            System.err.println("FAILED. Page is empty");
        }
        notepad.printRecords();

    }
}
