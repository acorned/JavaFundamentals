package javase01.t06;

/**
 * Created by Александр on 08/06/2017.
 */

public class NoteRecord {
    private String header = null;
    private String text = null;

    NoteRecord(String newHeader, String newText) {
        this.header = newHeader;
        this.text = newText;
    }

    public String getHeader() {
        return header;
    }

    public String getText() {
        return text;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setText(String text) {
        this.text = text;
    }
}