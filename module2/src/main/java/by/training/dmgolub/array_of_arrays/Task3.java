package by.training.dmgolub.array_of_arrays;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

public class Task3 {

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
            int row = Parser.tryParseInt(scanner, "matrix row to print");
            System.out.print("Row " + row + ": ");
            printRow(matrix, row);
            int column = Parser.tryParseInt(scanner, "matrix column to print");
            System.out.print("Column " + column + ": ");
            printColumn(matrix, column);
        }
    }

    public static void printRow(int[][] matrix, int row) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        if (row < 0) {
            throw new IllegalArgumentException("Matrix row index can not be less than 0");
        }
        if (row >= matrix.length) {
            throw new IllegalArgumentException("Row index can not " +
                    "be greater than matrix.length " + matrix.length);
        }
        boolean first = true;
        for (int col = 0; col < matrix[row].length; ++col) {
            if (!first) {
                System.out.print(" ");
            }
            first = false;
            System.out.print(matrix[row][col]);
        }
        System.out.println();
    }

    public static void printColumn(int[][] matrix, int column) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        if (column < 0) {
            throw new IllegalArgumentException("Matrix column index can not be less than 0");
        }
        if (matrix.length > 0 && column >= matrix[0].length) {
            throw new IllegalArgumentException("Matrix column index can not " +
                    "be greater than matrix width: " + matrix[0].length);
        }
        boolean first = true;
        for (int row = 0; row < matrix.length; ++row) {
            if (!first) {
                System.out.print(" ");
            }
            first = false;
            System.out.print(matrix[row][column]);
        }
        System.out.println();
    }
}