package by.training.dmgolub.array_of_arrays;

/*  Задана матрица неотрицательных чисел.
    Посчитать сумму элементов в каждом столбце.
    Определить, какой столбец содержит максимальную сумму.      */
public class Task9 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Column with maximal sum of elements: "
                + findColumnWithMaxSumOfElements(matrix));
    }

    /**
     * Finds column with maximal sum of column elements.
     * @param matrix int matrix.
     * @return index of column with maximal sum of column elements.
     * @throws IllegalArgumentException when matrix is null.
     * @author DMGolub
     */
    public static int findColumnWithMaxSumOfElements(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        long[] sums = new long[matrix[0].length];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                sums[j] += matrix[i][j];
            }
        }
        long max = Long.MIN_VALUE;
        int index = 0;
        for (int k = 0; k < sums.length; ++k) {
            if (sums[k] > max) {
                max = sums[k];
                index = k;
            }
        }
        return index;
    }
}