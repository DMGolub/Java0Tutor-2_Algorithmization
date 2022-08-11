package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    public void print_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task10.printPositiveElementsOfMainDiagonal(null));
    }

    @Test
    public void print_shouldThrowIllegalArgumentException_whenMatrixIsNotSquare() {
        int[][] matrix = new int[2][3];
        assertThrows(IllegalArgumentException.class,
                () -> Task10.printPositiveElementsOfMainDiagonal(matrix));
    }

    @Test
    public void print_shouldPrint2Elements_whenThereAreTwoPositiveElements() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "1 9";
        int[][] matrix = {
                {1, 2, 3},
                {4, -5, 6},
                {7, 8, 9}
        };

        Task10.printPositiveElementsOfMainDiagonal(matrix);

        assertEquals(expected, out.toString());
    }
}