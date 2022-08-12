package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task15Test {

    @Test
    public void findMax_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task15.findMaxElement(null));
    }

    @Test
    public void findMax_shouldReturnMaximumElement_whenMatrixContainsElements() {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        assertEquals(9, Task15.findMaxElement(matrix));
    }

    @Test
    public void replace_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task15.replaceOddNumbers(null, 1));
    }

    @Test
    public void replace_shouldReplaceOddElements_whenThereAreSuchElementsInTheMatrix() {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Integer[][] expected = {
                {9, 2, 9},
                {4, 9, 6},
                {9, 8, 9}
        };

        Task15.replaceOddNumbers(matrix, 9);

        assertArrayEquals(expected, matrix);
    }
}