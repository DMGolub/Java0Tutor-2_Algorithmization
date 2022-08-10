package by.training.dmgolub.one_dimensional_array;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Дана последовательность целых чисел a1, a2, ..., aN. Образовать
    новую последовательность, выбросив из исходной те члены, которые
    равны min(a1, a2, ..., aN).                                   */
public class Task8 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "sequence length (N)");
            while (n < 1) {
                System.out.println("Sequence length must be greater than 0. Please try again.");
                n = Parser.tryParseInt(scanner, "sequence length (N)");
            }
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) {
                String variableName = "sequence[" + i + "]";
                array[i] = Parser.tryParseInt(scanner, variableName);
            }
            int[] arrayWithoutMinimums = excludeMinElements(array);
            for (int element : arrayWithoutMinimums) {
                System.out.println(element);
            }
        }
    }

    /**
     * Excludes minimum elements from the given array.
     * @param array integer sequence.
     * @return array without miniumu elements.
     * @throws IllegalArgumentException when array is null.
     * @author DMGolub
     */
    public static int[] excludeMinElements(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        int min = findMin(array);
        int minCount = countElements(array, min);
        int[] result = new int[array.length - minCount];
        int index = 0;
        for (int element : array) {
            if (element != min) {
                result[index++] = element;
            }
        }
        return result;
    }

    /**
     * Counts the number of elements in the given array equal to the given element.
     * @param array integer array.
     * @param element integer number.
     * @return counted number of elements.
     * @throws IllegalArgumentException when array is null.
     * @author DMGolub
     */
    public static int countElements(int[] array, int element) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        int count = 0;
        for (int currElement : array) {
            if (currElement == element) {
                ++count;
            }
        }
        return count;
    }

    /**
     * Finds minimum element of a given array.
     * @param array integer sequence.
     * @return min element.
     * @throws IllegalArgumentException when array is null.
     * @author DMGolub
     */
    public static int findMin(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can not be null");
        }
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}