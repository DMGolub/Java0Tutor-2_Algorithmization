package by.training.dmgolub.array_of_arrays;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Сформировать случайную матрицу m x n, состоящую
    из нулей и единиц, причем в каждом столбце число
    единиц равно номеру столбца.                */
public class Task14 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int m = parseMatrixSize("m (number of rows)", scanner);
            int n = parseMatrixSize("n (number of columns)", scanner);
            while (m < n) {
                System.out.println("Number of rows can not be " +
                        "less then number of columns. Please try again");
                m = parseMatrixSize("m (number of rows)", scanner);
                n = parseMatrixSize("n (number of columns)", scanner);
            }
            int[][] matrix = createRandomMatrix(m, n);
            printMatrix(matrix);
        }
    }

    /**
     * Creates random matrix of 0's and 1's.
     * Number of 1's in each column is equal to column index (starts from 1).
     * @param rows integer number of rows,
     * @param columns integer number of columns.
     * @return generated random matrix.
     * @throws IllegalArgumentException when number of rows is less than
     * number of columns.
     * @author DMGolub
     */
    public static int[][] createRandomMatrix(int rows, int columns) {
        if (rows < columns) {
            throw new IllegalArgumentException("Number of rows " +
                    "can not be less than number of columns");
        }
        int[][] matrix = new int[rows][columns];
        for (int columnIndex = 0; columnIndex < columns; ++columnIndex) {
            int counter = 0;
            while (counter <= columnIndex) {
                int rowIndex = (int) (Math.random() * rows);
                if (matrix[rowIndex][columnIndex] == 0) {
                    matrix[rowIndex][columnIndex] = 1;
                    ++counter;
                }
            }
        }
        return matrix;
    }

    /**
     * Parses matrix size with provided name from console.
     * Checks if the size is greater or equal to 1.
     * @param sizeName String matrix size name,
     * @param scanner Scanner.
     * @return matrix size.
     * @author DMGolub
     */
    private static int parseMatrixSize(String sizeName, Scanner scanner) {
        int size = Parser.tryParseInt(scanner, "matrix size " + sizeName);
        while (size < 1) {
            System.out.println("Matrix size must be " +
                    "greater or equal to 1. Please try again.");
            size = Parser.tryParseInt(scanner, "matrix size " + sizeName);
        }
        return size;
    }

    private static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        for (int i = 0; i < matrix.length; ++i) {
            boolean first = true;
            for (int j = 0; j < matrix[i].length; ++j) {
                if (!first) {
                    System.out.print(" ");
                }
                first = false;
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}