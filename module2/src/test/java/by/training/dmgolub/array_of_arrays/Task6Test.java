package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    public void fillMatrix_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task6.fillMatrix(null));
    }

    @Test
    public void fillMatrix_shouldThrowIllegalArgumentException_whenMatrixSizeIsOdd() {
        Integer[][] matrix = new Integer[3][3];

        assertThrows(IllegalArgumentException.class,
                () -> Task6.fillMatrix(matrix));
    }

    @Test
    public void fillMatrix_shouldFillTheMatrix_whenMatrixSizeIsEven() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[][] expected = {
                {1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1}
        };
        Integer[][] matrix = new Integer[6][6];

        Task6.fillMatrix(matrix);

        assertArrayEquals(expected, matrix);
    }
}