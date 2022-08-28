package by.training.dmgolub.decomposing;

import by.training.dmgolub.one_dimensional_array.Task6;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    public void isPrimeNumber_shouldReturnFalse_whenNumberIsNegative() {
        assertFalse(by.training.dmgolub.one_dimensional_array.Task6.isPrimeNumber(-1));
    }

    @Test
    public void isPrimeNumber_shouldReturnTrue_whenNumberIs2() {
        assertTrue(by.training.dmgolub.one_dimensional_array.Task6.isPrimeNumber(2));
    }

    @Test
    public void isPrimeNumber_shouldReturnFalse_whenNumberIs4() {
        assertFalse(by.training.dmgolub.one_dimensional_array.Task6.isPrimeNumber(4));
    }

    @Test
    public void isPrimeNumber_shouldReturnTrue_whenNumberIs5() {
        assertTrue(Task6.isPrimeNumber(5));
    }

    @Test
    public void printPrimeTwins_shouldThrowIllegalArgumentException_whenFromIndexIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Task13.printPrimeTwins(-1, 5));
    }

    @Test
    public void printPrimeTwins_shouldThrowIllegalArgumentException_whenToIndexIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Task13.printPrimeTwins(2, -4));
    }

    @Test
    public void printPrimeTwins_shouldPrint3And5_whenN3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "3, 5";

        Task13.printPrimeTwins(3, 6);

        assertEquals(expected + System.lineSeparator(), out.toString());
    }

    @Test
    public void printPrimeTwins_shouldPrint5And7_whenN5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "5, 7";

        Task13.printPrimeTwins(5, 10);

        assertEquals(expected + System.lineSeparator(), out.toString());
    }
}