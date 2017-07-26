package task01;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class CrazyLoggerTest {
    @Test
    void logTest() {
        CrazyLogger logger = new CrazyLogger();
        logger.log("The very first message");
        logger.log("The second message");
        logger.log("Some other string");
        System.out.printf("%s", logger.getCrazyLog());
        assertThat(logger.search("message").size(), Is.is(2));
    }

}