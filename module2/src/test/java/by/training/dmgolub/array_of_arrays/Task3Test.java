package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    public void printRow_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task3.printRow(null, 1));
    }

    @Test
    public void printRow_shouldThrowIllegalArgumentException_whenRowIsLessThan0() {
        int[][] matrix = new int[1][1];

        assertThrows(IllegalArgumentException.class,
                () -> Task3.printRow(matrix, -1));
    }

    @Test
    public void printRow_shouldThrowIllegalArgumentException_whenRowIndexIsOutOfBounds() {
        int[][] matrix = new int[1][1];

        assertThrows(IllegalArgumentException.class,
                () -> Task3.printRow(matrix, 1));
    }

    @Test
    public void printRow_shouldPrintRow_whenThereIsSuchRowInTheMatrix() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "4 5 6";
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Task3.printRow(matrix, 1);

        assertEquals(expected + System.lineSeparator(), out.toString());
    }

    @Test
    public void printColumn_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task3.printColumn(null, 1));
    }

    @Test
    public void printColumn_shouldThrowIllegalArgumentException_whenRowIsLessThan0() {
        int[][] matrix = new int[1][1];

        assertThrows(IllegalArgumentException.class,
                () -> Task3.printColumn(matrix, -1));
    }

    @Test
    public void printColumn_shouldThrowIllegalArgumentException_whenRowIndexIsOutOfBounds() {
        int[][] matrix = new int[1][1];

        assertThrows(IllegalArgumentException.class,
                () -> Task3.printColumn(matrix, 1));
    }

    @Test
    public void printColumn_shouldPrintRow_whenThereIsSuchColumnInTheMatrix() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "2 5 8";
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Task3.printColumn(matrix, 1);

        assertEquals(expected + System.lineSeparator(), out.toString());
    }
}