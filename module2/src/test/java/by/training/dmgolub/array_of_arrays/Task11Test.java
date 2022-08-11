package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {

    @Test
    public void fillMatrix_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task11.fillMatrix(null, 15));
    }

    @Test
    public void fillMatrix_shouldFillMatrixWithNumbersFrom0To15_whenMatrixIsNotNull() {
        Integer[][] matrix = new Integer[10][20];

        Task11.fillMatrix(matrix, 16);
        boolean numbersFrom0To15 = true;
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 20; ++j) {
                if (matrix[i][j] < 0 || matrix[i][j] > 15) {
                    numbersFrom0To15 = false;
                    break;
                }
            }
        }

        assertTrue(numbersFrom0To15);
    }

    @Test
    public void findAndPrintRows_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task11.findAndPrintRows(null, 1, 1));
    }

    @Test
    public void findAndPrintRows_shouldPrint2Rows_whenThereAre2SuchRows() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Integer[][] matrix = {
                {6, 5, 12, 10, 5, 10, 1, 5, 7, 14, 7, 10, 7, 3, 14, 2, 0, 8, 0, 7},
                {13, 12, 11, 13, 11, 8, 10, 11, 10, 14, 0, 2, 9, 3, 2, 1, 5, 10, 6, 14},
                {5, 7, 3, 5, 13, 4, 13, 6, 3, 13, 0, 4, 2, 7, 11, 9, 6, 10, 5, 4},
                {14, 7, 8, 6, 12, 4, 4, 3, 10, 10, 3, 14, 13, 14, 6, 13, 9, 13, 2, 5}
        };
        StringJoiner expected = new StringJoiner(System.lineSeparator());
        expected.add("Row 0:  6  5 12 10  5 10  1  5  7 14  7 10  7  3 14  2  0  8  0  7")
                .add("Row 2:  5  7  3  5 13  4 13  6  3 13  0  4  2  7 11  9  6 10  5  4");

        Task11.findAndPrintRows(matrix, 5, 3);

        assertEquals(expected.toString() + System.lineSeparator(), out.toString());
    }
}