// Print the number of 7’s that are in the 2d array.
//  Example :
//  Input - int[][] array = { {4,7,8},{8,8,7} };
//  Output - 2

package TwoDArray;

public class findKey {
   public static int countNo(int matrix[][]) {
    int count = 0;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j]==7) {
                count++;
            }
        }
    }
    return count;
   }
   public static void main(String[] args) {
    int matrix[][] = { {4,7,8},{8,8,7} };
    System.out.println(countNo(matrix));
   } 
}
