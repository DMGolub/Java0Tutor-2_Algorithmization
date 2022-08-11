package by.training.dmgolub.array_of_arrays;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Сформировать квадратную матрицу порядка N по правилу:
    a[i][j] = sin((i * i - j * j) / n)
    и подсчитать количество положительных элементов в ней.  */
public class Task7 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "matrix size");
            while (n < 1) {
                System.out.println("Matrix size must be greater than 0");
                n = Parser.tryParseInt(scanner, "matrix size");
            }
            Double[][] matrix = new Double[n][n];
            System.out.println("There are " +
                    fillMatrixAndCountPositive(matrix) + " positive values.");
            System.out.println("Matrix:");
            Task4.printMatrix(matrix);
        }
    }

    /**
     * Fills matrix following the rule: a[i][j] = sin((i * i - j * j) / n)
     * and counts the number of positive elements.
     * @param matrix double square matrix.
     * @throws IllegalArgumentException when matrix is null.
     * @author DMGolub
     */
    public static int fillMatrixAndCountPositive(Double[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        int positiveCount = 0;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                double value = Math.sin((i * i - j * j) / (double) matrix.length);
                if (value > 0) {
                    ++positiveCount;
                }
                matrix[i][j] = value;
            }
        }
        return positiveCount;
    }
}