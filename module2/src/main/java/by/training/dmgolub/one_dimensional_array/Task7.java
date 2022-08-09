package by.training.dmgolub.one_dimensional_array;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Даны действительные числа a1, a2, ..., a2N.
    Найти max(a1 + a2N, a2 + a2N-1, ..., aN + aN+1)     */
public class Task7 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "sequence size (N)");
            double[] array = new double[n];
            for (int i = 0; i < n; ++i) {
                String variableName = "sequence[" + i + "]";
                array[i] = Parser.tryParseInt(scanner, variableName);
            }
            System.out.println("Max of (a[1] + a[2N], a[2] + a[2N-1], " +
                    "..., a[N] + a[N+1]) = " + findMaxOfPairs(array));
        }
    }

    /**
     * Finds maximum of pairs (a[1] + a[2N], a[2] + a[2N-1], a[N] + a[N+1]).
     * @param array double sequence.
     * @return maximum of pairs.
     * @throws IllegalArgumentException when array is null of array length in not even.
     * @author DMGolub
     */
    public static double findMaxOfPairs(double[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        if (array.length % 2 != 0) {
            throw new IllegalArgumentException("Array length must be even");
        }
        double max = Double.MIN_VALUE;
        for (int i = 0; i < array.length / 2; ++i) {
            double sumOfPair = array[i] + array[array.length - i - 1];
            if (sumOfPair > max) {
                max = sumOfPair;
            }
        }
        return max;
    }
}