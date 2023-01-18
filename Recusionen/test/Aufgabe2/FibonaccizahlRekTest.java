package Aufgabe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonaccizahlRekTest {

    @Test
    void fibonaccizahlTest() {
        assertEquals(5,FibonaccizahlRek.fibonaccizahl(5));
        assertEquals(144,FibonaccizahlRek.fibonaccizahl(12));
    }
}