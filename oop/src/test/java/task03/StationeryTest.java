package task03;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class StationeryTest {
    @Test
    void clerkTest() {
        Clerk clerk = new Clerk();
        Paper ledger = new Paper("Thick ledger", 96, "White", 100);
        Drawing pen = new Drawing("Pen", "Blue", 100);

        for (int i = 0; i < 10; i++) {
            assertThat(ledger.writeText("There is a string in ledger", pen), is("There is a string in ledger"));
        }
        assertThat(ledger.writeText("There is a string in ledger", pen), is("Draw is empty, try another one"));

        pen.displayAllFields();

        ledger.takeToClerk(clerk);
        pen.takeToClerk(clerk);

        String[] a = {"Thick ledger", "Pen"};
        assertThat(clerk.getAllNames(), is(a));

        assertThat(clerk.getWholeCost(), is(200));
        }

    }