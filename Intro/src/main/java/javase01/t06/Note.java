package javase01.t06;

/**
 * Creates a notepad which can save to 50 records.
 * @author Alexander Zheludkov
 * @version 1.0
 */
public class Note {
    /** Array of note records */
    private NoteRecord[] notes = new NoteRecord[50];
    /**
     * Adds a new record to notes.
     * @return {@code true} if record was added and {@code false} if notepad is full.
     * @param record New record. */
    boolean addRecord(NoteRecord record) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
             notes[i] = record;
             return true;
            }
        }
        return false;
    }

    /** Removes record by its index.
     * @param index Index of record
     * @throws IndexOutOfBoundsException if index more than size of notepad
     * @throws NoEntryException if element is empty already
     */
    void removeRecordByIndex(int index) throws IndexOutOfBoundsException, NoEntryException {

        if (index > notes.length)
            throw new IndexOutOfBoundsException();
        else if (notes[index] == null)
            throw new NoEntryException();
        else
            notes[index] = null;
    }

    /** Edits record by its index.
     * @param index Index of record
     * @param newHeader Edited header
     * @param newText Edited text
     * @throws IndexOutOfBoundsException If index more than size of notepad
     * @throws NoEntryException If element is empty
     */
    void editRecordByIndex(int index, String newHeader, String newText) throws IndexOutOfBoundsException, NoEntryException {

        if (index > notes.length)
            throw new IndexOutOfBoundsException();
        else if (notes[index] == null)
            throw new NoEntryException();
        notes[index].setHeader(newHeader);
        notes[index].setText(newText);

    }

    /**Prints all the records which are not empty */
    void printRecords() {
        for (NoteRecord note : notes) {
            if (note != null) System.out.printf("%s%n%s%n", note.getHeader(), note.getText());
        }
    }
}

