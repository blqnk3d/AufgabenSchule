package Aufgabe1;

import org.junit.jupiter.api.Test;

import static Aufgabe1.KehrwertUngeradeZahlen.summKehrwert;
import static Aufgabe1.KehrwertUngeradeZahlen.SummKehrwertRec;
import static org.junit.jupiter.api.Assertions.*;

class KehrwertUngeradeZahlenTest {

    @Test
    void summKehrwertTest() {
        assertEquals(0.86666,summKehrwert(6),0.00001);
        assertEquals(0.78489,summKehrwert(1000),0.00001);
    }

    @Test
    void summKehrwertRecTest() {
        assertEquals(0.86666,SummKehrwertRec(6),0.00001);
        assertEquals(0.78489,SummKehrwertRec(1000),0.00001);

    }
}