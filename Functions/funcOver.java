package Functions;
import java.util.Scanner;

public class funcOver {
    public static int mul(int a,int b) {
        return a*b;
    }
    public static int mul(int a,int b , int c) {
        return a*b*c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int prooftwo = mul(a, b);
        int Productofthree = mul(a, b, c);
        System.out.println(prooftwo);
        System.out.println(Productofthree);
        
        
        sc.close();
    }
}
