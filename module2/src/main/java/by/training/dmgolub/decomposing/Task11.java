package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Написать метод (методы), определяющмй, в каком из
    данных двух чисел больше цифр.                  */
public class Task11 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double number1 = Parser.tryParseDouble(scanner, "first number");
            double number2 = Parser.tryParseDouble(scanner, "second number");
            int digitCountDifference = countDigits(number1) - countDigits(number2);
            if (digitCountDifference > 0) {
                System.out.println("The first number contains more digits than the second.");
            } else if (digitCountDifference < 0) {
                System.out.println("The second number contains more digits than the first.");
            } else {
                System.out.println("The numbers contain the same number of digits.");
            }
        }
    }

    /**
     * Counts the number of digits in the given number.
     * @param number double number.
     * @return number of digits.
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