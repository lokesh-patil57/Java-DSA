// Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix,
// Input - int[][] array = { {4,7,8},{8,8,7} };
//Matrix
//  a11    a12    a13
//  a21    a22    a23
//  Transposed Matrix
//  a11    a21
//  a12    a22
//  a13    a23


public class TransposeofArray {
    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        printMatrix(arr);

        int row = 2, col = 3;
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        printMatrix(transpose);
    }
}
