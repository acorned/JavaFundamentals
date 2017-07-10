package task04;

import org.junit.jupiter.api.Test;
import task03.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Александр on 10/07/2017.
 */
class NoviceTest {
    @Test
    void setSortedByName() {
        Clerk clerk = new Novice();
        List<Stationery> noviceWorkplace = clerk.getWorkplace();
        System.out.println(clerk.getWholeCost());

        for (Stationery stat : noviceWorkplace) {
            stat.displayAllFields();
        }
    }

}