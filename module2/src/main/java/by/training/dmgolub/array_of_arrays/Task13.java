package by.training.dmgolub.array_of_arrays;

/*  Отсортировать столбцы матрицы по возрастанию
    и убыванию значений элементов.           */
public class Task13 {

    public static void main(String[] args) {
        Integer[][] matrix = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        System.out.println("Matrix columns sorted in natural order:");
        sortMatrixColumns(matrix, true);
        Task4.printMatrix(matrix);
        System.out.println("Matrix columns sorted in reversed order:");
        sortMatrixColumns(matrix, false);
        Task4.printMatrix(matrix);
    }

    /**
     * Sorts matrix columns in natural order if naturalOrder is true and in reversed order otherwise.
     * @param matrix integer matrix.
     * @param naturalOrder boolean flag if natural order.
     * @throws IllegalArgumentException when matrix is null.
     * @author DMGolub
     */
    public static void sortMatrixColumns(Integer[][] matrix, boolean naturalOrder) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        for (int column = 0; column < matrix.length; ++column) {
            for (int i = 0; i < matrix.length; ++i) {
                for (int j = 1; j < matrix.length - i; ++j) {
                    if (naturalOrder) {
                        if (matrix[j][column] < matrix[j - 1][column]) {
                            Integer temp = matrix[j][column];
                            matrix[j][column] = matrix[j - 1][column];
                            matrix[j - 1][column] = temp;
                        }
                    } else {
                        if (matrix[j][column] > matrix[j - 1][column]) {
                            Integer temp = matrix[j][column];
                            matrix[j][column] = matrix[j - 1][column];
                            matrix[j - 1][column] = temp;
                        }
                    }
                }
            }
        }
    }
}