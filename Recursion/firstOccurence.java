package Recursion;

public class firstOccurence {
    public static int firstOccurence(int arr[] ,int i , int key) {
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,4};
        System.out.println(firstOccurence(arr, 0, 4));
    }
}
