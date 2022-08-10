package by.training.dmgolub.one_dimensional_array;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Дан целочисленный массив с количеством элементов n. Сжать массив,
    выбросив из него каждый второй элемент (освободившиеся элементы
    заполнить нулями).
    Примечание: дополнительный массив не использовать.          */
public class Task10 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "array length");
            while (n < 1) {
                System.out.println("Array length must be greater than 1. Please try again.");
                n = Parser.tryParseInt(scanner, "array length");
            }
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) {
                String variableName = "array[" + i + "]";
                array[i] = Parser.tryParseInt(scanner, variableName);
            }
            compressArray(array);
            System.out.print("Compressed array:");
            for (int element : array) {
                System.out.print(" " + element);
            }
        }
    }

    /**
     * Compresses an array by deleting every second element, then moving
     * elements left replacing them by zero.
     * @param array integer sequence.
     * @throws IllegalArgumentException when array is null.
     * @author DMGolub
     */
    public static void compressArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        if (array.length < 2) {
            return;
        }
        int index = 1;
        for (int i = 2; i < array.length; i += 2) {
            array[index++] = array[i];
            if (i > 2) {
                array[i -1] = 0;
            }
            array[i] = 0;
        }
        array[array.length - 1] = 0;
    }
}