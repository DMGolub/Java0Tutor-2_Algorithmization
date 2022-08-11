package by.training.dmgolub.array_of_arrays;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Сформировать квадратную матрицу порядка n
    по заданному образцу (n - четное):
    { 1  1  1  ...  1  1  1 }
    { 0  1  1  ...  1  1  0 }
    { 0  0  1  ...  1  0  0 }
    { .. .. .. ...  .. .. ..}
    { 0  1  1  ...  1  1  0 }
    { 1  1  1  ...  1  1  1 }              */
public class Task6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "matrix size");
            while (n < 2 && n % 2 == 1) {
                System.out.println("Matrix size must be greater than 1 and even");
                n = Parser.tryParseInt(scanner, "matrix size");
            }
            Integer[][] matrix = new Integer[n][n];
            fillMatrix(matrix);
            Task4.printMatrix(matrix);
        }
    }

    /**
     * Fills matrix following the principle:
     * { 1  1  1  ...  1  1  1 }
     * { 0  1  1  ...  1  1  0 }
     * { 0  0  1  ...  1  0  0 }
     * { .. .. .. ...  .. .. ..}
     * { 0  1  1  ...  1  1  0 }
     * { 1  1  1  ...  1  1  1 }
     * @param matrix integer square matrix.
     * @throws IllegalArgumentException when matrix is null or matrix size is odd.
     * @author DMGolub
     */
    public static void fillMatrix(Integer[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        if (matrix.length == 0 || matrix.length % 2 == 1) {
            throw new IllegalArgumentException("Matrix size must be greater than 0 and even");
        }
        for (int i = 0; i < matrix.length; ++i) {
            if (i < matrix.length / 2) {
                for (int j = i; j < matrix.length - i; ++j) {
                    matrix[i][j] = 1;
                }
            } else {
                for (int j = matrix.length - i - 1; j <= i; ++j) {
                    matrix[i][j] = 1;
                }
            }
        }
    }
}