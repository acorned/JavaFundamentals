package task04;

import org.junit.jupiter.api.Test;
import task03.*;
import java.util.List;

class NoviceTest {
    @Test
    void setSortedByName() {
        Novice clerk = new Novice();
        List<Stationery> noviceWorkplace = clerk.getWorkplace();
        System.out.println(clerk.getWholeCost());

        for (Stationery stat : noviceWorkplace) {
            System.out.println(stat.getName());
        }

        clerk.setSortedByName();

        for (Stationery stat : noviceWorkplace) {
            System.out.println(stat.getName());
        }
    }

}