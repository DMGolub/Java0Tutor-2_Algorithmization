package by.training.dmgolub.one_dimensional_array;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Даны целые числа a1, a2, ..., aN. Вывести на печать те числа,
    для которых ai > i.                                       */
public class Task5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "sequence A length (N)");
            while (n < 1) {
                System.out.println("Sequence length must be greater than 0. Please try again.");
                n = Parser.tryParseInt(scanner, "sequence length (N)");
            }
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) {
                String variableName = "a[" + i + "]";
                array[i] = Parser.tryParseInt(scanner, variableName);
            }
            printElementsGreaterThanIndex(array);
        }

    }

    /**
     * Prints elements of an array, that are greater than element index.
     * @param array integer array.
     * @author DMGolub
     */
    public static void printElementsGreaterThanIndex(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > i) {
                System.out.println(array[i]);
            }
        }
    }
}