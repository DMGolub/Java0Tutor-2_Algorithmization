package by.training.dmgolub.one_dimensional_array;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    public void printElements_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task5.printElementsGreaterThanIndex(null));
    }

    @Test
    public void printElements_shouldPrintNothing_whenArrayIsEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Task5.printElementsGreaterThanIndex(new int[0]);

        assertEquals("", out.toString());
    }

    @Test
    public void printElements_shouldPrintNothing_whenThereAreNoSuchElements() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] array = {0, 1, 2, 3, 4};

        Task5.printElementsGreaterThanIndex(array);

        assertEquals("", out.toString());
    }

    @Test
    public void printElements_shouldPrintElements_whenThereAreSuchElements() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] array = {0, 1, 2, 4, 5, 6};
        StringJoiner expected = new StringJoiner(System.lineSeparator());
        expected.add("4").add("5").add("6");

        Task5.printElementsGreaterThanIndex(array);

        assertEquals(expected.toString() + System.lineSeparator(),
                out.toString());
    }
}