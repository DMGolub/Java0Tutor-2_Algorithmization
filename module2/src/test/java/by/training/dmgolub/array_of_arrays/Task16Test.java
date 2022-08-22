package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task16Test {

    @Test
    public void fillSquare_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task16.fillMagicSquare(null));
    }

    @Test
    public void fillSquare_shouldThrowIllegalArgumentException_whenMatrixSizeIs2() {
        Integer[][] square = new Integer[2][2];

        assertThrows(IllegalArgumentException.class,
                () -> Task16.fillMagicSquare(square));
    }

    @Test
    public void fillSquare_shouldFillMagicSquare_whenMatrixSizeIs1() {
        Integer[][] square = new Integer[1][1];
        Integer[][] expected = {
                {1}
        };

        Task16.fillMagicSquare(square);

        assertArrayEquals(expected, square);
    }

    @Test
    public void fillSquare_shouldFillMagicSquare_whenMatrixSizeIs3() {
        Integer[][] square = new Integer[3][3];
        Integer[][] expected = {
                {6, 1, 8},
                {7, 5 ,3},
                {2, 9, 4}
        };

        Task16.fillMagicSquare(square);

        assertArrayEquals(expected, square);
    }

    @Test
    public void fillSquare_shouldFillMagicSquare_whenMatrixSizeIs5() {
        final int squareSize = 5;
        Integer[][] square = new Integer[squareSize][squareSize];

        Task16.fillMagicSquare(square);

        boolean isMagicSquare = true;
        int mainDiagonalSum = 0;
        int sideDiagonalSum = 0;
        for (int i = 0; i < squareSize; ++i) {
            mainDiagonalSum += square[i][i];
            sideDiagonalSum += square[i][squareSize - i - 1];
        }
        isMagicSquare = mainDiagonalSum == sideDiagonalSum;
        int[] rowSums = new int[squareSize];
        int[] columnSums = new int[squareSize];
        for (int j = 0; j < squareSize; ++j) {
            for (int k = 0; k < squareSize; ++k) {
                // sum
            }
        }
        for (int m = 0; m < squareSize; ++m) {
            isMagicSquare = isMagicSquare && rowSums[m] == mainDiagonalSum;
            isMagicSquare = isMagicSquare && columnSums[m] == mainDiagonalSum;
        }
        assertTrue(isMagicSquare);
    }
}