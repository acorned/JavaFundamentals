package task01;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class KeywordFinder {
    public static final String[] KEYWORDS = {"abstract", "assert", "boolean", "break", "byte",
            "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else",
            "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import",
            "instanceof", "int", "interface", "long", "native",
            "new", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super",
            "switch", "synchronized", "this", "throw", "throws",
            "transient", "try", "void", "volatile", "while"
    };

    public static int findAllKeywords(String pathFrom, String pathTo) {
        byte[] bytesReaded;
        int counter = 0;
        try (FileInputStream in = new FileInputStream(pathFrom);
             FileOutputStream out = new FileOutputStream(pathTo)) {
            int bytesAvailable = in.available();
            bytesReaded = new byte[bytesAvailable];
            in.read(bytesReaded, 0, bytesAvailable);
            for (String word : new String(bytesReaded).split("\\s+")) {
                if (Arrays.asList(KEYWORDS).contains(word)) {
                    counter++;
                    out.write((word + "\n").getBytes("UTF-8"));
                }
            }
            out.write(("Total: " + counter).getBytes("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    return counter;
    }

}