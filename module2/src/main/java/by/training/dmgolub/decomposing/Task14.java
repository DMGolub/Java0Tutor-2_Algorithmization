package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Натуральное число, в записи которого n цифр, называется числом Армстронга,
    если сумма его цифр, возведенная в степень n, равна самому числу.
    Найти все числа Армстронга от 1 до k.
    Для решения задачи использовать декомпозицию.                           */
public class Task14 {

    private static final int MIN_NUMBER = 1;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int k = Parser.tryParseInt(scanner, "K (K > 1)");
            while (k < 2) {
                System.out.println("K can not be less than 2. Please try again.");
                k = Parser.tryParseInt(scanner, "K (K > 1)");
            }
            printArmstrongNumbers(MIN_NUMBER, k);
        }
    }

    /**
     * Prints all the Armstrong numbers found in the given range of natural numbers.
     * @param fromNumber integer first number of the range,
     * @param toNumber integer last number of the range.
     * @throws IllegalArgumentException when any of bounds is negative.
     * @author DMGolub
     */
    public static void printArmstrongNumbers(int fromNumber, int toNumber) {
        if (fromNumber < 0 || toNumber < 0) {
            throw new IllegalArgumentException("Bound can not be negative");
        }
        if (fromNumber > toNumber) {
            int temp = fromNumber;
            fromNumber = toNumber;
            toNumber = temp;
        }
        int counter = 0;
        for (int i = fromNumber; i <= toNumber; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("No Armstrong numbers found");
        }
    }

    /**
     * Determines if the given number is an Armstrong number.
     * @param number integer number.
     * @return true if the number is an Armstrong number and false otherwise.
     * @author DMGolub
     */
    public static boolean isArmstrongNumber(int number) {
        int count = countDigits(number);
        int sumOfPowers = 0;
        int temp = number;
        while (temp != 0) {
            sumOfPowers += Math.pow(temp % 10, count);
            temp /= 10;
        }
        return sumOfPowers == number;
    }

    /**
     * Counts the number of digits in the given number.
     * @param number double number.
     * @return number of digits.s
     * @author DMGolub
     */
    public static int countDigits(double number) {
        int count = 0;
        String numberStr = String.valueOf(number);
        for (int i = 0; i < numberStr.length(); i++) {
            if (Character.isDigit(numberStr.charAt(i))) {
                count++;
            }
        }
        if (numberStr.endsWith(".0")) {
            count--;
        }
        return count;
    }
}