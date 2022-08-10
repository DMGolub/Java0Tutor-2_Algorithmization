package by.training.dmgolub.array_of_arrays;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Дана квадратная матрица. Вывести на экран
    все элементы, стоящие на диагонали.    */
public class Task2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "matrix size");
            while (n < 1) {
                System.out.println("Matrix size must be greater than 1");
                n = Parser.tryParseInt(scanner, "matrix size");
            }
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    String variableName = "matrix[" + i + "][" + j + "]";
                    matrix[i][j] = Parser.tryParseInt(scanner, variableName);
                }
            }
            printDiagonal(matrix);
        }
    }

    /**
     * Prints elements located on the diagonal of the matrix.
     * @param matrix integer square matrix.
     * @throws IllegalArgumentException when matrix is null.
     * @author DMGolub
     */
    public static void printDiagonal(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        boolean first = true;
        for (int i = 0; i < matrix.length; ++i) {
            if (!first) {
                System.out.print(" ");
            }
            first = false;
            System.out.print(matrix[i][i]);
        }
    }
}