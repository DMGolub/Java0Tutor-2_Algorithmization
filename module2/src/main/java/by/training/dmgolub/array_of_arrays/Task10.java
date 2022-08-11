package by.training.dmgolub.array_of_arrays;

public class Task10 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, -5, 6},
                {7, 8, 9}
        };
        printPositiveElementsOfMainDiagonal(matrix);
    }

    /**
     * Prints positive elements of the main diagonal of the given square matrix.
     * @param matrix integer square matrix.
     * @throws IllegalArgumentException when matrix is null of matrix is not
     * a square matrix.
     * @author DMGolub
     */
    public static void printPositiveElementsOfMainDiagonal(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        if (matrix.length > 0 && matrix.length != matrix[0].length) {
            throw new IllegalArgumentException(
                    "The given matrix is not a square matrix");
        }
        boolean first = true;
        for (int i = 0; i < matrix.length; ++i) {
            if (matrix[i][i] > 0) {
                if (!first) {
                    System.out.print(" ");
                }
                first = false;
                System.out.print(matrix[i][i]);
            }
        }
    }
}