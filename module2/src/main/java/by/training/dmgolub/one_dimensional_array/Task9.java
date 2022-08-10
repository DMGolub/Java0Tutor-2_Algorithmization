package by.training.dmgolub.one_dimensional_array;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  В массиве целых чисел с количеством элементов n найти
    наиболее часто встречающееся число. Если таких чисел
    несколько, то определить наименьшее из них.        */
public class Task9 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "sequence length (N)");
            while (n < 1) {
                System.out.println("Sequence length must be greater than 0. Please try again.");
                n = Parser.tryParseInt(scanner, "sequence length (N)");
            }
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) {
                String variableName = "sequence[" + i + "]";
                array[i] = Parser.tryParseInt(scanner, variableName);
            }
            System.out.println("Most common number = "
                    + findMostCommonNumber(array));
        }
    }

    /**
     * Finds most common number in the given sequence.
     * @param array integer sequence.
     * @return most common number.
     * @throws IllegalArgumentException when array is null.
     * @author DMGolub
     */
    public static int findMostCommonNumber(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can no be null");
        }
        int[] counters = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                if (array[i] == array[j]) {
                    ++counters[i];
                }
            }
        }
        int max = findMax(counters);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < counters.length; ++i) {
            if (counters[i] == max && array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    /**
     * Finds maximum element of a given array.
     * @param array integer sequence.
     * @return min element.
     * @throws IllegalArgumentException when array is null.
     * @author DMGolub
     */
    public static int findMax(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }
}