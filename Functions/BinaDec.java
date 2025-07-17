package Functions;
import java.util.Scanner;

public class BinaDec {
    public static void BinaToDec(int binNum){
        int myNum = binNum;
        int power = 0;
        int dec = 0;
        while (binNum>0) {
            int lastDigit = binNum%10;
            dec = dec + (lastDigit * (int)Math.pow(2, power));
            power++;
            binNum = binNum/10;
        }
        System.out.println("The Decimal of " + myNum +" is : "+dec);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        BinaToDec(binNum);
        sc.close();
    }
}
