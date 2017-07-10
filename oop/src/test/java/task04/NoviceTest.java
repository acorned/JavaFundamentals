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

        clerk.sortByName();
        System.out.println();

        for (Stationery stat : noviceWorkplace) {
            System.out.println(stat.getName());
        }

        clerk.sortByCost();
        System.out.println();

        for (Stationery stat : noviceWorkplace) {
            System.out.println(stat.getCost());
        }

        clerk.sortByCostAndName();
        System.out.println();

        for (Stationery stat : noviceWorkplace) {
            System.out.println(stat.getName());
        }
    }

}