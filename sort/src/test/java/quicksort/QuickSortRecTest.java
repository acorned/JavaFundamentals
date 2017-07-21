package quicksort;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class QuickSortRecTest {
    @Test
    void sortTest() {
        Integer[] ints = {1, 4, 3, 2, 8, 7, 10, 9, 6, 5};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        QuickSortRec.sort(Integer::compareTo, ints);
        assertThat(ints, Is.is(expected));
    }

}