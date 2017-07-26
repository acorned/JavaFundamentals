package task01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CrazyLogger {

    private StringBuilder crazyLog = new StringBuilder();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY : hh-mm");

    public void log(String message){
        crazyLog.append(String.format("%s - %s;\n",
                LocalDateTime.now().format(formatter),
                message));
    }

    public StringBuilder getCrazyLog() {
        return crazyLog;
    }
}
