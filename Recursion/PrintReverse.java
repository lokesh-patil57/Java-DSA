package Recursion;

public class PrintReverse {
    public static void printRev(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printRev(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printRev(n);
    }
}
