package javase01.t06;

/**
 * Created by Александр on 06/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        Note notepad = new Note();
        //Let's add some records to our notepad

        notepad.addRecord(new NoteRecord("Title", "Some text to write"));
        notepad.addRecord(new NoteRecord("Other Title", "Some another text"));
        notepad.addRecord(new NoteRecord("", "Text without title"));

        //Now let's print all the records
        notepad.printRecords();

        //Too much records, let's delete some.
        notepad.removeRecordByIndex(1);

        //Now we'll try to delete record which is already deleted
        try{
            notepad.removeRecordByIndex(1);
        } catch(NoEntryException e) {
            System.out.println("FAILED REMOVING. Page is empty");
        }
        //And what about index which doesn't exist?
        try{
            notepad.removeRecordByIndex(52);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("FAILED REMOVING. Wrong index");
        }

        //We need to edit record
        notepad.editRecordByIndex(2, "New Title", "Now this record has title");

        //How it looks now?
        notepad.printRecords();
    }
}
