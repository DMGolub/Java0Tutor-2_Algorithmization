package by.training.dmgolub.one_dimensional_array;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Задана последовательность N вещественных чисел. Вычислить сумму
    чисел, порядковые номера которых являются простыми числами.  */
public class Task6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "sequence length (N)");
            while (n < 1) {
                System.out.println("Sequence length must be greater than 0. Please try again.");
                n = Parser.tryParseInt(scanner, "sequence length (N)");
            }
            double[] array = new double[n];
            for (int i = 0; i < n; ++i) {
                String variableName = "array[" + i + "]";
                array[i] = Parser.tryParseDouble(scanner, variableName);
            }
            System.out.println("Sum of elements with prime indexes = "
                    + sumOfElementsWithPrimeIndexes(array));
        }
    }

    /**
     * Calculates the sum of elements of an array with prime indexes.
     * @param array double sequence.
     * @return sum of elements.
     * @throws IllegalArgumentException when array is null.
     * @author DMGolub.
     */
    public static double sumOfElementsWithPrimeIndexes(double[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        double sum = 0.0;
        for (int i = 0; i < array.length; ++i) {
            if (isPrimeNumber(i)) {
                sum += array[i];
            }
        }
        return sum;
    }

    /**
     * Determines if the given number is prime.
     * @param number integer.
     * @return true if the given number is prime and false otherwise.
     * @author DMGolub
     */
    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}