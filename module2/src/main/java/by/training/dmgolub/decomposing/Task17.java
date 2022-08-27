package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Из заданного числа вычли сумму его цифр. Из результата
    вновь вычли сумму его цифр и т.д. Сколько таких действий
    надо произвести, чтобы получить нуль?
    Для реления задачи ипользовать декомпоозицию.         */
public class Task17 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "number");
            while (n < 0) {
                System.out.println("Number can not be negative. Please try again.");
                n = Parser.tryParseInt(scanner, "number");
            }
            int count = countIterations(n);
            System.out.println(count + " iteration(s) needed");
        }
    }

    /**
     * Determines the number of iterations required to bring the given number
     * to zero by subtracting the sum of its digits from the number.
     * @param number integer number.
     * @return number of iterations.
     * @throws IllegalArgumentException when number is negative.
     * @author DMGolub
     */
    public static int countIterations(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number can not be negative");
        }
        int count = 0;
        while (number != 0) {
            number -= sumOfDigits(number);
            count++;
            System.out.println("Iteration: " + count + " number = " + number);
        }
        return count;
    }

    /**
     * Calculates the sum of digits of the given number.
     * @param number integer number.
     * @return sum of digits of the given number.
     * @author DMGolub
     */
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return Math.abs(sum);
    }
}