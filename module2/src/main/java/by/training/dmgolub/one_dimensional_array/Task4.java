package by.training.dmgolub.one_dimensional_array;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Даны действительные числа a1, a2, ..., aN. Поменять местами
    наибольший и наименьший элементы.                        */
public class Task4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "sequence A length (N)");
            while (n < 1) {
                System.out.println("Sequence length must be greater than 0. Please try again.");
                n = Parser.tryParseInt(scanner, "sequence A length (N)");
            }
            double[] array = new double[n];
            for (int i = 0; i < n; ++i) {
                String itemName = "A[" + i + "]";
                array[i] = Parser.tryParseDouble(scanner, itemName);
            }
            swapMinAndMaxArrayElements(array);
        }
    }

    /**
     * Swaps minimal and maximal elements of the given array.
     * @param array double array.
     * @throws IllegalArgumentException when array is null.
     * @author DMGolub
     */
    public static void swapMinAndMaxArrayElements(double[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        if (array.length == 0) {
            return;
        }
        double minElement = Double.MAX_VALUE;
        double maxElement = Double.MIN_VALUE;
        int minElementIndex = 0;
        int maxElementIndex = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < minElement) {
                minElement = array[i];
                minElementIndex = i;
            }
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxElementIndex = i;
            }
        }
        double temp = array[minElementIndex];
        array[minElementIndex] = array[maxElementIndex];
        array[maxElementIndex] = temp;
    }
}