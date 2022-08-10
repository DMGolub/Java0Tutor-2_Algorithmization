package by.training.dmgolub.one_dimensional_array;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  В массив A[N] занесены натуральные числа. Найти сумму тех элементов,
    которые кратны данному K.                                        */
public class Task1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "array A length (N)");
            while (n < 1) {
                System.out.println("Array length must be greater than 0. Please try again.");
                n = Parser.tryParseInt(scanner, "array A length (N)");
            }
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) {
                String itemName = "A[" + i + "]";
                a[i] = Parser.tryParseInt(scanner, itemName);
            }
            int k = Parser.tryParseInt(scanner, "k");
            System.out.println("Sum of multiples of k in A[N] = " + sumOfMultiples(a, k));
        }
    }

    /**
     * Calculates the sum of array elements that are multiples of a given number;
     * @param array integer array,
     * @param k integer
     * @return sum of array elements that are multiples of k.
     * @author DMGolub
     */
    public static int sumOfMultiples(int[] array, int k) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        int sum = 0;
        for (int item : array) {
            if (item % k == 0) {
                sum += item;
            }
        }
        return sum;
    }
}