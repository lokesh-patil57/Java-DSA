package Recursion;

public class lastOccurence {
    public static int lastOccurence(int arr[] ,int i , int key) {
        if (i== arr.length) {
            return -1;
        }
        int isfound = lastOccurence(arr, i+1, key); 
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,4};
        System.out.println(lastOccurence(arr, 0, 4));
    }
}
