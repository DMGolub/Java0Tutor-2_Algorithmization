package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    public void findColumn_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task9.findColumnWithMaxSumOfElements(null));
    }

    @Test
    public void findColumn_shouldReturn2_whenMaxSumColumIndexIs2() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        assertEquals(2,
                Task9.findColumnWithMaxSumOfElements(matrix));
    }
}