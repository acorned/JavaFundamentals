package task02;

import java.io.*;
import java.util.Arrays;

public class KeywordFinderByChars {
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

    public static int findAllKeywordsByChars(String pathFrom, String pathTo) {
        int counter = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(pathFrom));
             BufferedWriter out = new BufferedWriter(new FileWriter(pathTo))) {

            StringBuilder sb = new StringBuilder();
            int text;
            while ((text = in.read()) != -1) sb.append((char) text);

            for (String word : sb.toString().split("\\s+")) {
                if (Arrays.asList(KEYWORDS).contains(word)) {
                    counter++;
                    out.write(word + "\n");
                }
            }

            out.write("Total: " + counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }

}
