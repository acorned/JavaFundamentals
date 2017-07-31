package task02;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class KeywordFinderByCharsTest {
    @Test
    void findKeywords() {
       assertThat(KeywordFinderByChars.findAllKeywordsByChars("src/main/resources/Disciplines.java",
               "src/main/resources/keyword_find_result_by_FileWriter.txt"), Is.is(11));
   }
}