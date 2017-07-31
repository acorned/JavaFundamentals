package task01;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class KeywordFinderTest {
    @Test
    void findKeywords() {
        assertThat(KeywordFinder.findAllKeywords("src/main/resources/Disciplines.java",
                "src/main/resources/keyword_find_result_by_FileOutputStream.txt"), Is.is(11));
    }

}