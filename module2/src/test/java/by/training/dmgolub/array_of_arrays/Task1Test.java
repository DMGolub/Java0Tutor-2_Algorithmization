package by.training.dmgolub.array_of_arrays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void printOdd_shouldThrowIllegalArgumentException_whenMatrixIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task1.printOddColumnsWhereFirstElementIsGreaterThenLast(null));
    }

    @Test
    public void printOdd_shouldPrintTwoColumns_whenThereAreTwoSuchColumns() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        StringJoiner expected = new StringJoiner(System.lineSeparator());
        expected.add("1 5").add("1 5").add("2 6").add("2 6").add("0 4");
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6},
                {0, 1, 5, 3, 4}
        };

        Task1.printOddColumnsWhereFirstElementIsGreaterThenLast(matrix);

        assertEquals(expected.toString() + System.lineSeparator(),
                out.toString());
    }
}