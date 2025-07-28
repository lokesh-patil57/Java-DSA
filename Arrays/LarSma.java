// import java.util.Scanner;

public class LarSma {
    public static int getLargestSmallest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest <numbers[i]) {
                largest = numbers[i];
            } else if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest is : "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] ={1 ,3, 5 ,7,10, 2 , 4 ,6 };
        System.out.println("Largest of numbers : "+getLargestSmallest(numbers));
    }
}
