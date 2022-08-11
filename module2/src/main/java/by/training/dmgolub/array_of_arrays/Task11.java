package by.training.dmgolub.array_of_arrays;

/*  Матрицу 10х20 заполнить случайными числами от 0 до 15.
    Вывести на экран саму матрицу и номера строк,
    в которых число 5 встречается 3 и более раз.        */
public class Task11 {

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[10][20];
        fillMatrix(matrix, 15);
        printMatrix(matrix);
        findAndPrintRows(matrix, 5, 3);
    }

    private static void printMatrix(Integer[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        for (int i = 0; i < matrix.length; ++i) {
            boolean first = true;
            for (int j = 0; j < matrix[i].length; ++j) {
                if (!first) {
                    System.out.print(" ");
                }
                first = false;
                System.out.printf("%2d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Fills the given matrix with random integer numbers from 0 to given number.
     * @param matrix integer matrix.
     * @throws IllegalArgumentException when matrix is null.
     * @author DMGolub
     */
    public static void fillMatrix(Integer[][] matrix, int number) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = (int) (Math.random() * number);
            }
        }
    }

    /**
     * Finds and prints rows of the given matrix in which the given number
     * occurs at least the given number of times.
     * @param matrix integer matrix,
     * @param number integer number to be counter,
     * @param minCount integer minimum count of number.
     * @throws IllegalArgumentException when matrix is null.
     * @author DMGolub
     */
    public static void findAndPrintRows(Integer[][] matrix, int number, int minCount) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        for (int i = 0; i < matrix.length; ++i) {
            int numberCount = 0;
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] == number) {
                    ++numberCount;
                }
            }
            if (numberCount >= minCount) {
                System.out.print("Row " + i + ":");
                for (int k = 0; k < matrix[i].length; ++k) {
                    System.out.printf(" %2d", matrix[i][k]);
                }
                System.out.println();
            }
        }
    }
}