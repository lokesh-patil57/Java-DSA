package Functions;

import java.util.Scanner;

public class poduct {
    public static int mul(int a , int b) {
        int mul = a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = mul(a, b);
        System.out.println("Product is : "+ mul);
        sc.close();
    }
}
