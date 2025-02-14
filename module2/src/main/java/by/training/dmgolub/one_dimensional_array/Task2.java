package by.training.dmgolub.one_dimensional_array;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Дана последовательность действительных чисел a1, a2, ..., aN.
    Заменить все ее члены, большие данного Z, эти числом.
    Подсчитать количество замен.                       */
public class Task2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "sequence A length (N)");
            while (n < 1) {
                System.out.println("Sequence length must be greater than 0. Please try again.");
                n = Parser.tryParseInt(scanner, "sequence A length (N)");
            }
            double[] sequence = new double[n];
            for (int i = 0; i < n; ++i) {
                String itemName = "A[" + i + "]";
                sequence[i] = Parser.tryParseDouble(scanner, itemName);
            }
            double z = Parser.tryParseDouble(scanner, "Z");
            System.out.println(replaceAllMembersLargerThanGiven(sequence, z)
                    + " members replaced.");
        }
    }

    /**
     * Replaces all sequence members larger than given number (Z) with Z and
     * calculates the number of substitutions.
     * @param sequence double number sequence,
     * @param z double threshold.
     * @return number of substitutions.
     * @author DMGolub
     */
    public static int replaceAllMembersLargerThanGiven(double[] sequence, double z) {
        if (sequence == null) {
            throw new IllegalArgumentException("Sequence can not be null");
        }
        int count = 0;
        for (int i = 0; i < sequence.length; ++i) {
            if (sequence[i] > z) {
                sequence[i] = z;
                ++count;
            }
        }
        return count;
    }
}