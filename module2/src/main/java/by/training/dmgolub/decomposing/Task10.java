package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Дано натуральное число N. Написать метод (методы) для формирования
    массива, элементами которого являются цифры числа N.            */
public class Task10 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "N");
            while (n < 1) {
                System.out.println("N can not be less than 1. Please try again.");
                n = Parser.tryParseInt(scanner, "N");
            }
            int[] digits = splitNumber(n);
            printArray(digits);
        }
    }

    /**
     * Forms an array of digits of the given natural number as its elements.
     * @param number integer number.
     * @return array of integer number representing digits of the given number.
     * @throws IllegalArgumentException when the number is less than 1.
     * @author DMGolub
     */
    private static int[] splitNumber(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Number can not be less than 1");
        }
        int digitCount = String.valueOf(number).length();
        int[] digits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            digits[digitCount - i - 1] = number % 10;
            number /= 10;
        }
        return digits;
    }

    /**
     * Prints the given array.
     * @param array integer array.
     * @throws IllegalArgumentException when array is null.
     * @author DMGolub
     */
    private static void printArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        boolean first = true;
        for (int item : array) {
            if (!first) {
                System.out.print(", ");
            }
            first = false;
            System.out.print(item);
        }
    }
}