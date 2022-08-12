package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    public void sort_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task13.sortMatrixColumns(null, true));
    }

    @Test
    public void sort_shouldSortMatrixColumnsInNaturalOrder_whenFlagIsTrue() {
        Integer[][] matrix = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        Integer[][] expected = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };

        Task13.sortMatrixColumns(matrix, true);

        assertArrayEquals(expected, matrix);
    }

    @Test
    public void sort_shouldSortMatrixColumnsInReversedOrder_whenFlagIsFalse() {
        Integer[][] matrix = {
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}
        };
        Integer[][] expected = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        Task13.sortMatrixColumns(matrix, false);

        assertArrayEquals(expected, matrix);
    }
}