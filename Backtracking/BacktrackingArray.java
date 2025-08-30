package Backtracking;

public class BacktrackingArray {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void changeArr(int arr[] , int i , int val){
        // Base case
        if (i==arr.length) {
            printArray(arr);
            return;
        }
        
        // 0 index val
        arr[i] = val;

        // increment in value
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;

    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArray(arr);
    }
}
