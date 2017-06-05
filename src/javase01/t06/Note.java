package javase01.t06;

/**
 * Created by acorned on 06.06.17.
 */
public class Note {
    NoteRecord[] notes;

    public void showNotes(NoteRecord[] notes) {
        this.notes = notes;
    }
}

class NoteRecord {
    void EditRecord() {
        System.out.println("Edit record");
    }

    ;
}