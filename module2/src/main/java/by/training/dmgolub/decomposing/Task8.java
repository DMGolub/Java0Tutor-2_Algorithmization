package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3];
    D[3] + D[4] + D[5]; D[4] + D[5]+ D[6].
    Пояснение: составить метод (методы) для вычисления суммы трех
    последовательно расположенных элементов массива с номерами от
    k до m.                                                     */
public class Task8 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int arraySize = Parser.tryParseInt(scanner, "array size");
            while (arraySize < 6) {
                System.out.println("Array size can not be less than 6. Please try again");
                arraySize = Parser.tryParseInt(scanner, "array size");
            }
            int[] array = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                String variableName = "D[" + (i + 1) + "]";
                array[i] = Parser.tryParseInt(scanner, variableName);
            }
            System.out.println("D[1] + D[2] + D[3] = " + sumOfThreeElements(array, 0));
            System.out.println("D[3] + D[4] + D[5] = " + sumOfThreeElements(array, 2));
            System.out.println("D[4] + D[5] + D[6] = " + sumOfThreeElements(array, 3));
        }
    }

    /**
     * Calculates sum of three consecutive elements of the given array. Indexes start from 0.
     * @param array integer array.
     * @param fromIndex first index of three consecutive elements.
     * @return calculated sum.
     * @throws IllegalArgumentException when array is null or first index is negative or
     * array size is less than first index plus three.
     * @author DMGolub
     */
    public static int sumOfThreeElements(int[] array, int fromIndex) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        if (fromIndex < 0) {
            throw new IllegalArgumentException("First index can not be negative");
        }
        if (fromIndex + 2 >= array.length) {
            throw new IllegalArgumentException("First index can not be " +
                    "greater or equal to array length - 2");
        }
        int sum = 0;
        for (int i = fromIndex; i < fromIndex + 3; i++) {
            sum += array[i];
        }
        return sum;
    }
}