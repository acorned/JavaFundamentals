package task02;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by acorned on 30.06.17.
 */
class ClerkTest {

    @Test
    void getWholeCost() {
        Stationery pen = new Stationery(100, "Usual pen");
        Stationery pencil = new Stationery(50, "Usual pencil");
        Stationery paper = new Stationery(400, "Paper pack");
        Clerk clerk = new Clerk();
        clerk.addItem(pen);
        clerk.addItem(pencil);
        clerk.addItem(paper);

        assertThat(clerk.getWholeCost(), is(550));
    }

}