package by.training.dmgolub.one_dimensional_array;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    public void count_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task3.countNegativeZeroPositiveArrayElements(null));
    }

    @Test
    public void count_shouldPrintZeros_whenArrayIsEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        StringJoiner expected = new StringJoiner(System.lineSeparator());
        expected.add("Number of negative elements = 0");
        expected.add("Number of zero elements = 0");
        expected.add("Number of positive elements = 0");

        double[] array = new double[0];
        Task3.countNegativeZeroPositiveArrayElements(array);

        assertEquals(expected + System.lineSeparator(), out.toString());
    }

    @Test
    public void count_shouldCountElementsAndPrintResult_whenArrayIsNotEmpty() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        StringJoiner expected = new StringJoiner(System.lineSeparator());
        expected.add("Number of negative elements = 2");
        expected.add("Number of zero elements = 1");
        expected.add("Number of positive elements = 2");

        double[] array = {-2.0, -1.0, 0.0, 1.0, 2.0};
        Task3.countNegativeZeroPositiveArrayElements(array);

        assertEquals(expected + System.lineSeparator(), out.toString());
    }
}