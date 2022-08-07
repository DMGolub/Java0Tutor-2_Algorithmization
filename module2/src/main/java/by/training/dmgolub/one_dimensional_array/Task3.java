package by.training.dmgolub.one_dimensional_array;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Дан массив действительных чисел, размерность которого N.
    Подсчитать, сколько в нем отрицательных, положительных
    и нулевых элементов.                                */
public class Task3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "array size (N)");
            double[] array = new double[n];
            for (int i = 0; i < n; ++i) {
                String itemName = "array[" + i + "]";
                array[i] = Parser.tryParseDouble(scanner, itemName);
            }
            countNegativeZeroPositiveArrayElements(array);
        }
    }

    /**
     * Counts and prints number of negative, zero and positive elements in a given array.
     * @param array double array.
     * @author DMGolub
     */
    public static void countNegativeZeroPositiveArrayElements(double[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        int countNegative = 0;
        int countZero = 0;
        int countPositive = 0;
        for (double element : array) {
            if (element < 0) {
                ++countNegative;
            } else if (element > 0) {
                ++countPositive;
            } else {
                ++countZero;
            }
        }
        System.out.println("Number of negative elements = " + countNegative);
        System.out.println("Number of zero elements = " + countZero);
        System.out.println("Number of positive elements = " + countPositive);
    }
}