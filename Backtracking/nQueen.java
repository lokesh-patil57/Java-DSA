package Backtracking;

public class nQueen {
    public static void nqueen(char board[][], int row) {
        //base 
        if (row==board.length) {
            
        }
        for (int j = 0; j < board.length; j++) {
            board[row][j]='Q';
            nqueen(board, row+1); // function call
            board[row][j]='.';// backtraking step
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        // initialize
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
    }
}
