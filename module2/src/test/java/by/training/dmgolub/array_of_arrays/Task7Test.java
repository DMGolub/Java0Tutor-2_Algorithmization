package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    public void fillMatrix_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task7.fillMatrixAndCountPositive(null));
    }

    @Test
    public void fillMatrix_shouldFillTheMatrix_whenMatrixSizeIs2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Double[][] expected = {
                {Math.sin(0), Math.sin(-1 / 2.0)},
                {Math.sin(1 / 2.0), Math.sin(0.0)}
        };
        Double[][] matrix = new Double[2][2];

        int positiveCount = Task7.fillMatrixAndCountPositive(matrix);

        assertArrayEquals(expected, matrix);
        assertEquals(1, positiveCount);
    }

    @Test
    public void fillMatrix_shouldFillTheMatrix_whenMatrixSizeIs3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Double[][] expected = {
                {Math.sin(0), Math.sin(-1 / 3.0), Math.sin(-4 / 3.0)},
                {Math.sin(1 / 3.0), Math.sin(0.0), Math.sin(-3 / 3.0)},
                {Math.sin(4 / 3.0), Math.sin(3 / 3.0), Math.sin(0.0)}
        };
        Double[][] matrix = new Double[3][3];

        int positiveCount = Task7.fillMatrixAndCountPositive(matrix);

        assertArrayEquals(expected, matrix);
        assertEquals(3, positiveCount);
    }
}