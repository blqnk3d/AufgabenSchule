package Aufgabe3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroesterGemeinsameTeilerTest {

    @Test
    void ggTTEst() {
        assertEquals(7,GroesterGemeinsameTeiler.ggT(7,49));
        assertEquals(2,GroesterGemeinsameTeiler.ggT(8,1234));
    }
}