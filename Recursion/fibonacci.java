package Recursion;

public class fibonacci {
    public static int Fibo(int n) {
        if (n == 0 || n ==1) {
            return n ;
        }

        int fnm1 = Fibo(n-1);
        int fnm2 = Fibo(n-2);
        int fn = fnm1 + fnm2 ;
        return fn;

    }
    public static void main(String[] args) {
        System.out.println(Fibo(20));
        System.out.println(Fibo(21));
        System.out.println(Fibo(22));
        System.out.println(Fibo(23));
        System.out.println(Fibo(24));
        System.out.println(Fibo(25));
        System.out.println(Fibo(26));
    }
}
