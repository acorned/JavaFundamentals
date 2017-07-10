package task06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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