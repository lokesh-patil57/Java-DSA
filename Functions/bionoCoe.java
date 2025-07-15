package Functions;
import java.util.Scanner;


    

public class bionoCoe {
    public static int fact(int a) {
        int fact = 1;
        for(int i=1 ; i<=a ; i++){
            fact = fact*i ;
        }
        return fact;
    }
    public static float binocoe(int n , int r) {
        int d = n-r;
        int D = fact(d);
        int R = fact(r); 
        int N = fact(n); 
        float binocoe = N/(R*D); 
        return binocoe;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        float ans = binocoe(n, r);
        System.out.println("Binomial Coefficient is :"+ans);
        sc.close();
    }
}
