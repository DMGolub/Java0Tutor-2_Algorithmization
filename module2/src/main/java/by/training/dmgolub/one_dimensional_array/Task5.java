package by.training.dmgolub.one_dimensional_array;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Даны целые числа a1, a2, ..., aN. Вывести на печать те числа,
    для которых ai > i.                                       */
public class Task5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "sequence A size (N)");
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) {
                array[i] = Parser.tryParseInt(scanner, "a[i]");
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