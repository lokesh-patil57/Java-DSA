package DivideandConquer;

public class QuickSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // LAst element
        int pidx = partition(arr, si, ei);

        // Quick sort for left
        quickSort(arr, si, pidx - 1);
        // Quick sort for left
        quickSort(arr, pidx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
