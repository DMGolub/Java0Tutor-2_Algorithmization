package by.training.dmgolub.array_of_arrays;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  В числовой матрице поменять местами два любых столбца,
    т.е. все элементы одного столбца поставить на соответствующие
    им позиции другого, а элементы второго переместить в первый.
    Номера столбцов вводит пользователь с клавиатуры.
 */
public class Task8 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = parseMatrixSize("n", 1, scanner);
            int m = parseMatrixSize("m", 2, scanner);
            Integer[][] matrix = new Integer[n][m];
            readMatrix(matrix, scanner);

            System.out.println("Initial matrix:");
            Task4.printMatrix(matrix);

            int columnIndex1 = readColumnIndex("first column index", m - 1, scanner);
            int columnIndex2 = readColumnIndex("second column index", m - 1, scanner);
            swapColumns(matrix, columnIndex1, columnIndex2);
            System.out.println("Matrix with swapped columns:");
            Task4.printMatrix(matrix);
        }
    }

    /**
     * Swaps values of two given columns.
     * @param matrix integer matrix.
     * @param columnIndex1 integer first column index,
     * @param columnIndex2 integer second column index.
     * @throws IllegalArgumentException when matrix is null.
     * @author DMGolub
     */
    public static void swapColumns(Integer[][] matrix, int columnIndex1, int columnIndex2) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        for (int k = 0; k < matrix.length; ++k) {
            int temp = matrix[k][columnIndex1];
            matrix[k][columnIndex1] = matrix[k][columnIndex2];
            matrix[k][columnIndex2] = temp;
        }
    }

    /**
     * Parses matrix size with provided name from console.
     * Checks if the size is greater or equal to the given threshold.
     * @param sizeName String matrix size name,
     * @param minSize integer minimum size value,
     * @param scanner Scanner.
     * @return matrix size.
     * @author DMGolub
     */
    private static int parseMatrixSize(String sizeName, int minSize, Scanner scanner) {
        int size = Parser.tryParseInt(scanner, "matrix size " + sizeName);
        while (size < minSize) {
            System.out.println("Matrix size must be greater or equal to "
                    + minSize + ". Please try again.");
            size = Parser.tryParseInt(scanner, "matrix size " + sizeName);
        }
        return size;
    }

    private static void readMatrix(Integer[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                String variableName = "matrix[" + i + "][" + j + "]";
                matrix[i][j] = Parser.tryParseInt(scanner, variableName);
            }
        }
    }

    private static int readColumnIndex(String name, int maxValue, Scanner scanner) {
        int index = Parser.tryParseInt(scanner, name);
        while (index < 0 || index > maxValue) {
            System.out.print("Column index can not be less than 0 or greater than "
                    + maxValue + ". Please try again.");
            index = Parser.tryParseInt(scanner, name);
        }
        return index;
    }
}