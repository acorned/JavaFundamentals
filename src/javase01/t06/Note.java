package javase01.t06;

/**
 * Created by acorned on 06.06.17.
 */
public class Note {
    private NoteRecord[] notes = new NoteRecord[50];
    private int numberOfRecords;

    Note(int index, NoteRecord note) {
        this.notes[index] = note;
    }

    public NoteRecord[] getNotes() {
        return notes;
    }

    private void addNote() {
        //add note
    }

    private void deleteNote(String header) {
        //delete note
    }
}

class NoteRecord {
    String header = null;
    String text = null;

    NoteRecord(String newHeader, String newText) {
        this.header = newHeader;
        this.text = newText;
    }

    //  void editRecord(sourcHeader, newHeader, newText) {
    //      NoteRecord.header =
    //  }

    ;
}