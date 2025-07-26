package TwoDArray;

public class StairCasseSearch {
    public static boolean stairCaseSearch(int matrix[][] ,int key) {
        // Initialize starting position: top-right corner of the matrix
        int row = 0;                     // Start at the first row (index 0)
        int col = matrix[0].length - 1;  // Start at the last column of the first row

        // Loop continues as long as we are within the matrix boundaries
        while (row < matrix.length && col >= 0) {
            // Case 1: Key found
            if (matrix[row][col] == key) {
                System.out.println("Key found at : (" + row + "," + col + ")");
                return true; // Return true as the key is found
            }
            // Case 2: Key is smaller than the current element
            // Move left to search for smaller values in the same row
            else if (key < matrix[row][col]) {
                col--;
            }
            // Case 3: Key is larger than the current element
            // Move down to search for larger values in the next row
            else {
                row++;
            }
        }

        // If the loop finishes, it means the key was not found in the matrix
        System.out.println("Key not found");
        return false; // Return false as the key was not found
    }

    public static void main(String[] args) {
        // Define the 2D matrix (sorted rows and columns)
        int matrix[][] = { { 10, 20, 30, 40 },
                           { 15, 25, 35, 45 },
                           { 27, 29, 37, 48 },
                           { 32, 33, 39, 50 } };

        // Call the staircaseSearch method to find the key '33'
        stairCaseSearch(matrix, 33);
    }
}