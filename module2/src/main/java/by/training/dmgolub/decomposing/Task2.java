package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Написать метод (методы) для нахождения наибольшего
    общего делителя четырех натуральных чисел.      */
public class Task2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = Parser.tryParseInt(scanner, "a");
            int b = Parser.tryParseInt(scanner, "b");
            int c = Parser.tryParseInt(scanner, "c");
            int d = Parser.tryParseInt(scanner, "d");
            System.out.println("Greatest common divisor = "
                    + greatestCommonDivisor(a, b, c, d));
        }
    }

    /**
     * Calculates the greatest common divisor of four given numbers.
     * @param a int first number,
     * @param b int second number,
     * @param c int third number,
     * @param d int fourth number.
     * @return greatest common divisor.
     * @author DMGolub
     */
    public static int greatestCommonDivisor(int a, int b, int c, int d) {
        return greatestCommonDivisor(greatestCommonDivisor(a, b),
                greatestCommonDivisor(c, d));
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