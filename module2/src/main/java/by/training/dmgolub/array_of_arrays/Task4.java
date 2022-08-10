package by.training.dmgolub.array_of_arrays;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Сформировать квадратную матрицу порядка N по заданному образу (n - четное).
    1       2       3       ...     n
    n       n-1     n-2     ...     1
    1       2       3       ...     n
    ...     ...     ...     ...     ...
    n       n-1     n-2     ...     1                                       */
public class Task4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "matrix size");
            while (n < 2 && n % 2 == 1) {
                System.out.println("Matrix size must be greater than 1 and even");
                n = Parser.tryParseInt(scanner, "matrix size");
            }
            int[][] matrix = new int[n][n];
            fillMatrix(matrix);
            printMatrix(matrix);
        }
    }

    /**
     * Fills matrix following the principle:
     * { 1   2    3    ...  n  }
     * { n   n-1  n-2  ...  1  }
     * { 1   2    3    ...  n  }
     * { ... ...  ...  ...  ...}
     * { n   n-1  n-2  ...  1  }
     * @param matrix integer square matrix.
     * @throws IllegalArgumentException when matrix is null or matrix size is odd.
     * @author DMGolub
     */
    public static void fillMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        if (matrix.length == 0 || matrix.length % 2 == 1) {
            throw new IllegalArgumentException("Matrix size must be greater than 0 and even");
        }
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                if (i % 2 == 1) {
                    matrix[i][j] = matrix.length - j;
                } else {
                    matrix[i][j] = j + 1;
                }
            }
        }

    }

    /**
     * Prints the given matrix;
     * @param matrix integer matrix.
     * @throws IllegalArgumentException if matrix is null.
     * @author DMGolub
     */
    public static void printMatrix(int[][] matrix) {
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