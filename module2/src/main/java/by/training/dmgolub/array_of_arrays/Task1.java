package by.training.dmgolub.array_of_arrays;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Дана матрица. Вывести на экран все нечетные столбцы, у которых
    первый элемент больше последнего.                           */
public class Task1 {

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
            printOddColumnsWhereFirstElementIsGreaterThenLast(matrix);
        }
    }

    public static void printOddColumnsWhereFirstElementIsGreaterThenLast(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        for (int row = 0; row < matrix.length; ++row) {
            boolean first = true;
            for (int col = 0; col < matrix[row].length; col += 2) {
                if (matrix[0][col] > matrix[matrix.length - 1][col]) {
                    if (!first) {
                        System.out.print(" ");
                    }
                    first = false;
                    System.out.print(matrix[row][col]);
                }
            }
            System.out.println();
        }
    }
}