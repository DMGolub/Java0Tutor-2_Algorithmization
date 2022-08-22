package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Написать метод (методы), проверяющий, являются ли данные
    три числа взаимно простыми.                           */
public class Task6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = Parser.tryParseInt(scanner, "number a");
            int b = Parser.tryParseInt(scanner, "number b");
            int c = Parser.tryParseInt(scanner, "number c");
            System.out.println(areMutuallyPrimeNumbers(a, b, c) ? "YES" : "NO");
        }
    }

    /**
     * Determines if three given numbers are mutually prime.
     * @param a integer number one,
     * @param b integer number two,
     * @param c integer number tree.
     * @return true if the given numbers are mutually prime and false otherwise.
     * @author DMGolub
     */
    public static boolean areMutuallyPrimeNumbers(int a, int b, int c) {
        int gcd = greatestCommonDivisor(a, greatestCommonDivisor(b, c));
        return gcd == 1;
    }

    /**
     * Calculates the greatest common divisor of two given numbers.
     * @param a int first number,
     * @param b int second number.
     * @return greatest common divisor.
     * @author DMGolub
     */
    public static int greatestCommonDivisor(int a, int b) {
        while (a != 0 && b != 0) {
            if (Math.abs(a) > Math.abs(b)) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
}