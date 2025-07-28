package Strings;
import java.util.Scanner;

public class StringBasic {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "Lokesh Patil";
        Scanner sc = new Scanner(System.in);
        String role;
        role = sc.nextLine();
        System.out.println(role);
        String first = "Lokesh";
        String last = "Patil";
        String full = first + " " + last;
        System.out.println(full);
        System.out.println(full.length());
        printLetters(str);
        sc.close();
    }
}
