package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    public void printMatrix_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task4.printMatrix(null));
    }

    @Test
    public void printMatrix_shouldPrintMatrix_whenMatrixSizeIsGreaterThan0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "1 2\n3 4";
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        Task4.printMatrix(matrix);

        assertEquals(expected + System.lineSeparator(), out.toString());
    }

    @Test
    public void fillMatrix_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task4.fillMatrix(null));
    }

    @Test
    public void fillMatrix_shouldThrowIllegalArgumentException_whenMatrixSizeIsOdd() {
        int[][] matrix = new int[3][3];

        assertThrows(IllegalArgumentException.class,
                () -> Task4.fillMatrix(matrix));
    }

    @Test
    public void fillMatrix_shouldFillTheMatrix_whenMatrixSizeIsEven() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[][] expected = {
                {1, 2, 3, 4},
                {4, 3, 2, 1},
                {1, 2, 3, 4},
                {4, 3, 2, 1},
        };
        int[][] matrix = new int[4][4];

        Task4.fillMatrix(matrix);

        assertArrayEquals(expected, matrix);
    }
}