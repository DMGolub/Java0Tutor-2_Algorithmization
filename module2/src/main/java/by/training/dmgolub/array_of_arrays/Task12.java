package by.training.dmgolub.array_of_arrays;

/*  Отсортировать строки матрицы по возрастанию
    и убыванию значений элементов.           */
public class Task12 {

    public static void main(String[] args) {
        Integer[][] matrix = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        System.out.println("Matrix rows sorted in natural order:");
        sortMatrixRows(matrix, true);
        Task4.printMatrix(matrix);
        System.out.println("Matrix rows sorted in reversed order:");
        sortMatrixRows(matrix, false);
        Task4.printMatrix(matrix);
    }

    /**
     * Sorts matrix rows in natural order if naturalOrder is true and in reversed order otherwise.
     * @param matrix integer matrix.
     * @param naturalOrder boolean flag if natural order.
     * @throws IllegalArgumentException when matrix is null.
     * @author DMGolub
     */
    public static void sortMatrixRows(Integer[][] matrix, boolean naturalOrder) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix can not be null");
        }
        for (int row = 0; row < matrix.length; ++row) {
            for (int i = 0; i < matrix[row].length; ++i) {
                for (int j = 1; j < matrix[row].length - i; ++j) {
                    if (naturalOrder) {
                        if (matrix[row][j] < matrix[row][j -1]) {
                            Integer temp = matrix[row][j];
                            matrix[row][j] = matrix[row][j -1];
                            matrix[row][j -1] = temp;
                        }
                    } else {
                        if (matrix[row][j] > matrix[row][j -1]) {
                            Integer temp = matrix[row][j];
                            matrix[row][j] = matrix[row][j -1];
                            matrix[row][j -1] = temp;
                        }
                    }
                }
            }
        }
    }
}