package DivideandConquer;

public class MergeSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        
        printArray(arr);
    }
}
