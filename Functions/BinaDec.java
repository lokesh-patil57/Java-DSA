package Functions;

import java.util.Scanner;

public class BinaDec {
    public static void BinaToDec(int binNum) {
        int myNum = binNum;
        int power = 0;
        int dec = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, power));
            power++;
            binNum = binNum / 10;
        }
        System.out.println("The Decimal of " + myNum + " is : " + dec);

    }

    public static void DecToBin(int binNum) {
        int myNum = binNum;
        int power = 0;
        int bin = 0;
        while (binNum > 0) {
            int rem = binNum % 2;
            bin = bin + (rem * (int) Math.pow(10, power));
            power++;
            binNum = binNum / 2;
        }
        System.out.println("The Binary of " + myNum + " is : " + bin);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        DecToBin(binNum);
        sc.close();
    }
}
