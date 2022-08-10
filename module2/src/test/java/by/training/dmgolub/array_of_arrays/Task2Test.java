package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    public void printDiagonal_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task2.printDiagonal(null));
    }

    @Test
    public void printDiagonal_shouldPrintOneElement_whenMatrixIs1By1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "1";
        int[][] matrix = {{1}};

        Task2.printDiagonal(matrix);

        assertEquals(expected, out.toString());
    }

    @Test
    public void printDiagonal_shouldPrintTwoElements_whenMatrixIs2By2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "1 4";
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        Task2.printDiagonal(matrix);

        assertEquals(expected, out.toString());
    }

    @Test
    public void printDiagonal_shouldPrintThreeElements_whenMatrixIs3By3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "1 5 9";
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Task2.printDiagonal(matrix);

        assertEquals(expected, out.toString());
    }
}