package by.training.dmgolub.decomposing;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    public void splitNumber_shouldThrowIllegalArgumentException_whenNumberIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Task10.splitNumber(-1));
    }

    @Test
    public void splitNumber_shouldSplitNumberAndReturnAnArray_whenNumberIsGreaterThan0() {
        int[] expected = {1, 2, 3};

        assertArrayEquals(expected, Task10.splitNumber(123));
    }

    @Test
    public void printArray_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task10.printArray(null));
    }

    @Test
    public void printArray_shouldPrintTheGivenArray_whenArraySizeIsGreaterThan0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "1, 2, 3";
        int[] array = {1, 2, 3};

        Task10.printArray(array);

        assertEquals(expected, out.toString());
    }
}