package by.training.dmgolub.decomposing;

/*  Написать метод (методы) для вычисления суммы факториалов
    все нечетных чисел от 1 до 9.                         */
public class Task7 {

    public static void main(String[] args) {
        final int limit = 9;
        long sum = sumOfFactorialsOfOddNumbers(limit);
        System.out.println("Sum of factorials of odd numbers from 1 to 9 = " + sum);
    }

    /**
     * Calculates the sum of factorials of odd numbers from 1 to the given number.
     * @param number integer limit.
     * @return sum of factorials.
     * @throws IllegalArgumentException when number is less than 1.
     * @author DMGolub
     */
    public static long sumOfFactorialsOfOddNumbers(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Number can not be less than 1");
        }
        long sum = 0;
        for (int i = 1; i <= number; i += 2) {
            sum += factorial(i);
        }
        return sum;
    }

    /**
     * Calculates the factorial of the given number.
     * @param number integer number.
     * @return 1 if number is 0 or factorial of the given number otherwise.
     * @throws IllegalArgumentException when number is negative.
     * @author DMGolub
     */
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number can not be negative");
        }
        if (number == 0) {
            return 1;
        }
        long result = 1;
        for (long i = 1; i <= number; i++) {
            result *= i;
            System.out.println("i = " + i + ", result = " + result);
        }
        return result;
    }
}