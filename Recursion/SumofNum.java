package Recursion;

public class SumofNum {
    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        } 
        int fnp1 = Sum(n-1);
        int fn = n+ fnp1;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum(n));
    }
}
