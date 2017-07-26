package task01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrazyLogger {

    private StringBuilder crazyLog = new StringBuilder();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY : hh-mm");

    public void log(String message){
        crazyLog.append(String.format("%s - %s;\n",
                LocalDateTime.now().format(formatter),
                message));
    }

    public ArrayList<String> search(String searchString){
        ArrayList<String> searchResult = new ArrayList<String>();
        String searchFormatter = String.format(searchString);
        Pattern searchPattern = Pattern.compile(searchFormatter);
        Matcher m = searchPattern.matcher(crazyLog);
        while (m.find()) {
            searchResult.add(m.group());
        }
        return searchResult;
    }

    public StringBuilder getCrazyLog() {
        return crazyLog;
    }
}
