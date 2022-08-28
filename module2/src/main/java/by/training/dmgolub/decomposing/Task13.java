package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Два простых числа называются "близнецами", если они отличаются
    друг от друга на 2 (например, 41 и 43).
    Найти и напечатать все пары "близнецов" из отрезка [n, 2 * n],
    где n - заданное натуральное число больше 2.
    Для решения задачи использовать декомпозицию.               */
public class Task13 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("This program finds all prime twins in the range [N, N * 2].");
            int n = Parser.tryParseInt(scanner, "N (N > 2)");
            while (n < 3) {
                System.out.println("N can not be less than 3. Please try again.");
                n = Parser.tryParseInt(scanner, "N (N > 2)");
            }
            printPrimeTwins(n, n * 2);
        }
    }

    /**
     * Prints all the prime twins found in the given range of natural numbers.
     * @param fromNumber integer first number of the range,
     * @param toNumber integer last number of the range.
     * @throws IllegalArgumentException when any of bounds is negative.
     * @author DMGolub
     */
    public static void printPrimeTwins(int fromNumber, int toNumber) {
        if (fromNumber < 0 || toNumber < 0) {
            throw new IllegalArgumentException("Bound can not be negative");
        }
        if (fromNumber > toNumber) {
            int temp = fromNumber;
            fromNumber = toNumber;
            toNumber = temp;
        }
        int counter = 0;
        for (int i = fromNumber; i <= toNumber - 2; i++) {
            if (isPrimeNumber(i) && isPrimeNumber(i + 2)) {
                System.out.println(i + ", " + (i + 2));
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("No twins found");
        }
    }

    /**
     * Determines if the given number is prime.
     * @param number integer.
     * @return true if the given number is prime and false otherwise.
     * @author DMGolub
     */
    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}