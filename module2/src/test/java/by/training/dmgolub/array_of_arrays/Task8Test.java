package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    public void swapColumns_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task8.swapColumns(null, 1, 2));
    }

    @Test
    public void swapColumns_shouldSwapColumns_whenMatrixHasThreeColumns() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Integer[][] expected = {
                {1, 3, 2},
                {4, 6, 5},
                {7, 9, 8}
        };
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Task8.swapColumns(matrix, 1, 2);

        assertArrayEquals(expected, matrix);
    }
}