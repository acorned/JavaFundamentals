package task03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ImageParser {

    public static ArrayList<String> parseFile(String path){
        ArrayList<String> imageLinks = new ArrayList<>();
        StringBuilder fileContent = new StringBuilder();
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            while (br.ready()){
                fileContent.append(br.read());
            }
            System.out.println("File OK");

        } catch (Exception e) {
            System.out.println(e);
        }
        return imageLinks;
    }

    public static void main(String[] args) {
        parseFile("strings/src/main/resources/Java.SE.03.Information handling_task_attachment.html");
    }
}
