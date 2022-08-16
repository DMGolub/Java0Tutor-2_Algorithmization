package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Написать метод (методы) для нахождения наибольшего общего
    делителя и наименьшего общего кратного двух натуральных чисел:
    НОК(А, В) = A * B / НОД(A, B)                               */
public class Task1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = Parser.tryParseInt(scanner, "a");
            int b = Parser.tryParseInt(scanner, "b");
            System.out.println("Greatest common divisor = "
                    + greatestCommonDivisor(a, b));
            System.out.println("Greatest common multiple = "
                    + smallestCommonMultiple(a, b));
        }
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

    /**
     * Calculates the smallest common multiple of two given numbers.
     * @param a int first number,
     * @param b int second number.
     * @return greatest common divisor.
     * @author DMGolub
     */
    public static int smallestCommonMultiple(int a, int b) {
        if (a == 0 || b == 0) {
            return  0;
        }
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }
}