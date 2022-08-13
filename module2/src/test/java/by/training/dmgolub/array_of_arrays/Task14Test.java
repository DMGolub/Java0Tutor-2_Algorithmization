package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    public void createMatrix_shouldThrowIllegalArgumentException_whenRowsLessThanColumns() {
        assertThrows(IllegalArgumentException.class,
                () -> Task14.createRandomMatrix(2, 4));
    }

    @Test
    public void createMatrix_shouldCreateMatrix_whenRows1Columns1() {
        int[][] expected = {
                {1}
        };

        assertArrayEquals(expected, Task14.createRandomMatrix(1, 1));
    }

    @Test
    public void createMatrix_shouldCreateRandomMatrix_whenRows3Columns3() {
        int rows = 3;
        int columns = 3;
        int[] expectedCounts = {
                1, 2, 3
        };

        int[][] result = Task14.createRandomMatrix(rows, columns);
        int[] oneCountForColumn = new int[columns];
        for (int row = 0; row < rows; ++row) {
            for (int column = 0; column < columns; ++column) {
                if (result[row][column] == 1) {
                    ++oneCountForColumn[column];
                }
            }
        }

        assertArrayEquals(expectedCounts, oneCountForColumn);
    }

    @Test
    public void createMatrix_shouldCreateRandomMatrix_whenRows6Columns4() {
        int rows = 6;
        int columns = 4;
        int[] expectedCounts = {
                1, 2, 3, 4
        };

        int[][] result = Task14.createRandomMatrix(rows, columns);
        int[] oneCountForColumn = new int[columns];
        for (int row = 0; row < rows; ++row) {
            for (int column = 0; column < columns; ++column) {
                if (result[row][column] == 1) {
                    ++oneCountForColumn[column];
                }
            }
        }

        assertArrayEquals(expectedCounts, oneCountForColumn);
    }
}