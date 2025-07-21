import java.util.Scanner;

public class InvRotHalfP {
    public static void Inverted_Rotated_P(int n) {
        //Outer loop
        for(int i=1 ;i<=n;i++) {
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inverted_Rotated_P(4);
        sc.close();
    }
}