import java.util.Scanner;

public abstract class HolloRect {
    public static void hollow_rect(int totRows, int totCols) {
        // Outer loop
        for (int i = 1; i <= totRows; i++) {
            // Inner loop
            for (int j = 1; j <= totCols; j++) {
                //contion to print start (i,j) (rows,cols)
                if (i==1||i==totRows||j==1||j==totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                    
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hollow_rect(4, 5);
        sc.close();
    }
}
