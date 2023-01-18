package Aufgabe4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalscheDreieckTest {

    @Test
    void binomialTest() {
        PascalscheDreieck.printPyra(10);
        assertEquals(4,PascalscheDreieck.binomial(4,3));
        assertEquals(252,PascalscheDreieck.binomial(10,5));
    }
}