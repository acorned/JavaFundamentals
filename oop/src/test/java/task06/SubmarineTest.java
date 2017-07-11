package task06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubmarineTest {
    @Test
    void goCruise() {
        Submarine submarine = new Submarine();
        submarine.setFuel(100);
        assertTrue(submarine.goCruise().equals("The submarine went to cruise"));
        submarine.setFuel(0);
        assertTrue(submarine.goCruise().equals("Not enough fuel"));

    }

}