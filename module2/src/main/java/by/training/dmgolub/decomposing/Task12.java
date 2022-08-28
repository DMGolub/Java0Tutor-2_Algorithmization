package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Даны натуральные числа K и N. Написать метод (методы) формирования
    массива А, элементами которого являются числа, сумма цифр которых
    равна K и которые не больше N.                                  */
public class Task12 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sumOfDigits = parseNaturalInt(scanner, "sum of digits (K)");
            int maxValue = parseNaturalInt(scanner, "maximum value (N)");
            int[] array = formArray(sumOfDigits, maxValue);
            printArray(array);
        }
    }

    /**
     * Parses natural integer number from console.
     * @param scanner Scanner.
     * @param name String variable name.
     * @return parsed integer number.
     * @throws IllegalArgumentException when scanner or variable name is null.
     * @author DMGolub
     */
    public static int parseNaturalInt(Scanner scanner, String name) {
        if (scanner == null) {
            throw new IllegalArgumentException("Scanner can not be null");
        }
        if (name == null) {
            throw new IllegalArgumentException("Name can not be null");
        }
        int value = Parser.tryParseInt(scanner, name);
        while (value < 1) {
            System.out.println(name + " can not be negative or zero. Please try again.");
            value = Parser.tryParseInt(scanner, name);
        }
        return value;
    }

    public static int[] formArray(int sumOfDigits, int maxValue) {

        return new int[0];      // temp
    }

    /**
     * Prints the given array.
     * @param array integer array.
     * @throws IllegalArgumentException when array is null.
     * @author DMGolub
     */
    public static void printArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        boolean first = true;
        for (int element : array) {
            if (!first) {
                System.out.print(", ");
            }
            first = false;
            System.out.print(element);
        }
    }
}