package by.training.dmgolub.array_of_arrays;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Магическим квадратом порядка n называется квадратная
    матрица размера n x n, составленная из чисел 1, 2, 3, ..., n^2
    так, что суммы по каждому столбцу, каждой строке и каждой
    из двух больших диагоналей равны между собой.
    Построить такой квадрат. Пример магического квадрата порядка 3:
    6 1 8
    7 5 3
    2 9 4                                                       */
public class Task16 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "magic square size");
            while (n < 1 && n != 2) {
                System.out.println("Square size can not be " +
                        "less than 1 and equal to 2. Please try again.");
                n = Parser.tryParseInt(scanner, "magic square size");
            }
            Integer[][] magicSquare = new Integer[n][n];
            fillMagicSquare(magicSquare);
            System.out.println("Magic square:");
            Task4.printMatrix(magicSquare);

            long a = Long.remainderUnsigned(-2,3);
            int b = Integer.remainderUnsigned(-2,3);
            int c = -2%3;
            System.out.print(a + " " + b + " " + c);

            int value = 0;
            value = value > 0 ? ++value : --value;
            System.out.println("value = " + value);
        }
     }

    /**
     * Fills the given matrix with numbers following the rule of magic square:
     * the sums for each column, each row and each of the two large diagonals
     * are equal to each other. Matrix size can not be 2 x 2.
     * @param squareMatrix Integer square matrix.
     * @throws IllegalArgumentException when matrix is null or matrix is not square.
     * @author DMGolub
     */
    public static void fillMagicSquare(Integer[][] squareMatrix) {
        if (squareMatrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        if (squareMatrix.length != squareMatrix[0].length) {
            throw new IllegalArgumentException("Matrix must be square");
        }
        if (squareMatrix.length == 2) {
            throw new IllegalArgumentException("Matrix size can not be 2");
        }
    }
}