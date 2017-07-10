package task06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Александр on 11/07/2017.
 */
class SubmarineTest {
    @Test
    void goSwim() {
        Submarine submarine = new Submarine();
        submarine.setFuel(100);
        assertTrue(submarine.goSwim().equals("The submarine went swimming"));
        submarine.setFuel(0);
        assertTrue(submarine.goSwim().equals("Not enough fuel"));

    }

}