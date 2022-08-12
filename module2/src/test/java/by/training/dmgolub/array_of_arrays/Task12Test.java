package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {

    @Test
    public void sort_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task12.sortMatrixRows(null, true));
    }

    @Test
    public void sort_shouldSortMatrixInNaturalOrder_whenFlagIsTrue() {
        Integer[][] matrix = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        Integer[][] expected = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };

        Task12.sortMatrixRows(matrix, true);

        assertArrayEquals(expected, matrix);
    }

    @Test
    public void sort_shouldSortMatrixInReversedOrder_whenFlagIsFalse() {
        Integer[][] matrix = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };
        Integer[][] expected = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        Task12.sortMatrixRows(matrix, false);

        assertArrayEquals(expected, matrix);
    }
}