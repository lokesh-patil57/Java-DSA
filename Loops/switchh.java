import java.util.Scanner;

public class switchh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1: System.err.println("HELLO");
            break;
            case 2: System.err.println("Welcome");
            break;
            case 3: System.err.println("Namaste");
            break;
            
        }
        sc.close();
    }    
}
