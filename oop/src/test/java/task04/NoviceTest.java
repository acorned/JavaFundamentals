package task04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NoviceTest {
    @Test
    void sortBy() {
        Novice clerk = new Novice();

        clerk.sortByName();
        for (int i = 0; i < clerk.getWorkplace().size() - 1; i++){
            assertTrue(clerk.getWorkplace().get(i).getName().compareTo(clerk.getWorkplace().get(i + 1).getName()) <= 0);
        }

        clerk.sortByCost();
        for (int i = 0; i < clerk.getWorkplace().size() - 1; i++){
            assertTrue(clerk.getWorkplace().get(i).getCost() <= clerk.getWorkplace().get(i + 1).getCost());
        }
        clerk.sortByCostAndName();
        for (int i = 0; i < clerk.getWorkplace().size() - 1; i++){
            assertTrue(clerk.getWorkplace().get(i).getCost() <= clerk.getWorkplace().get(i + 1).getCost() ||
                    clerk.getWorkplace().get(i).getName().compareTo(clerk.getWorkplace().get(i + 1).getName()) <= 0);
        }
    }


}