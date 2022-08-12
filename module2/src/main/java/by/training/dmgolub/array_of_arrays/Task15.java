package by.training.dmgolub.array_of_arrays;

/*  Найти наибольший элемент матрицы и заменить
    все нечетные элементы на него.           */
public class Task15 {

    public static void main(String[] args) {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Initial matrix:");
        Task4.printMatrix(matrix);
        int max = findMaxElement(matrix);
        replaceOddNumbers(matrix, max);
        System.out.println("Matrix with replaced odd elements:");
        Task4.printMatrix(matrix);
    }

    /**
     * Finds maximum element in the given matrix.
     * @param matrix Integer matrix,
     * @return maximum element.
     * @throws IllegalArgumentException when matrix is null.
     * @author DMGolub
     */
    public static int findMaxElement(Integer[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Replaces all odd elements in the matrix by the given number.
     * @param matrix Integer matrix,
     * @param number integer number to replace odd elements.
     * @throws IllegalArgumentException when matrix is null.
     * @author DMGolub
     */
    public static void replaceOddNumbers(Integer[][] matrix, int number) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] % 2 == 1) {
                    matrix[i][j] = number;
                }
            }
        }
    }
}