package task01;

import org.junit.jupiter.api.Test;

class CrazyLoggerTest {
    @Test
    void logTest() {
        CrazyLogger logger = new CrazyLogger();
        logger.log("The very first message");
        logger.log("The second message");
        System.out.printf("%s", logger.getCrazyLog());
    }

}