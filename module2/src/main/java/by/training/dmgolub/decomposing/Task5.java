package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Составить программу, которая в массиве A[N] находит второе по величине число
    (вывести на печать число, которое меньше максимального элемента массива, но
    больше всех других элементов).                                           */
public class Task5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "number of elements in array");
            while (n < 2) {
                System.out.println("Number of elements can not be less than 2. Please try again.");
                n = Parser.tryParseInt(scanner, "number of elements in array");
            }
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                String variableName = "array[" + i + "]";
                numbers[i] = Parser.tryParseInt(scanner, variableName);
            }
            int secondMaximum = findSecondMaximum(numbers);
            System.out.println(secondMaximum);
        }
    }

    /**
     * Finds second maximum in the given array.
     * @param numbers integer array.
     * @return second maximum or Integer.MIN_VALUE if it can not be found.
     * @throws IllegalArgumentException when array of numbers is null.
     * @author DMGolub
     */
    public static int findSecondMaximum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        int maximum = Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maximum) {
                secondMaximum = maximum;
                maximum = number;
            } else if (number != maximum && number > secondMaximum) {
                secondMaximum = number;
            }
        }
        return secondMaximum;
    }
}