
package Arrays;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        System.out.println("Length of array : "+marks.length);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Phy :" + marks[0]);
        System.out.println("Chem :" + marks[1]);
        System.out.println("Math :" + marks[2]);
        // update array value
        // marks[2] = sc.nextInt();
        // System.out.println("Math :" + marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage : "+percentage+"%");

        sc.close();
    }
}
