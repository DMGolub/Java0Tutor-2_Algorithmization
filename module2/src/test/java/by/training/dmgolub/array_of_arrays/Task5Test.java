package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    public void fillMatrix_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task5.fillMatrix(null));
    }

    @Test
    public void fillMatrix_shouldThrowIllegalArgumentException_whenMatrixSizeIsOdd() {
        Integer[][] matrix = new Integer[3][3];

        assertThrows(IllegalArgumentException.class,
                () -> Task5.fillMatrix(matrix));
    }

    @Test
    public void fillMatrix_shouldFillTheMatrix_whenMatrixSizeIsEven() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Integer[][] expected = {
                {1, 1, 1, 1},
                {2, 2, 2, 0},
                {3, 3, 0, 0},
                {4, 0, 0, 0}
        };
        Integer[][] matrix = new Integer[4][4];

        Task5.fillMatrix(matrix);

        assertArrayEquals(expected, matrix);
    }
}