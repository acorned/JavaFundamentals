package javase01.t06;

/** Class describes note record with two fields
 * @author Alexander Zheludkov
 * @version 1.0
 */
public class NoteRecord {
    /**
     * {@link NoteRecord#header} Header of record
     * {@link NoteRecord#text} Text of record
     */
    private String header = null;
    private String text = null;

    /**
     * Sets header and text.
     * @param newHeader Header
     * @param newText Text
     */
    NoteRecord(String newHeader, String newText) {
        this.header = newHeader;
        this.text = newText;
    }

    /**
     * Gets header field.
     * @return Header of the record
     */
    public String getHeader() {
        return header;
    }

    /**
     * Gets text field.
     * @return Text of the record
     */
    public String getText() {
        return text;
    }

    /** Sets header.
     * @param header Header of the record
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /** Sets text.
     * @param text Text of the record
     */
    public void setText(String text) {
        this.text = text;
    }
}