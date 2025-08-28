package Recursion;

public class TillingProblem {
    public static int tilesCount(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertilcal conditon
        int verticle = tilesCount(n-1) ;
        // Horizontal condition
        int horizontal = tilesCount(n-2);
        // total ways
        int totalWays = verticle + horizontal;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilesCount(4));
    }
}
