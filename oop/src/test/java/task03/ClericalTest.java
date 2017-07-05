package task03;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by acorned on 06.07.17.
 */
class ClericalTest {
    private Ledger ledger = new Ledger(100, 96, "Crossed ledger 96p", "White");

    @BeforeEach
    void setUp() {


    }

    @Test
    void getCost() {
        assertThat(ledger.getCost(), Is(100));
    }

    @Test
    void getName() {
        assertThat(ledger.getName(), Is("Crossed ledger 96p"));
    }

}