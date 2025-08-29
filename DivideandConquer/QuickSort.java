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
        // pivot
        int pivot = arr[ei];
        // i index to -1 = invalid index
        int i = si - 1;

        // for loop for finding left and right values
        for (int j = si; j < ei; j++) { // except pivot index for swaping
            if (arr[j] <= pivot) {
                i++; // if a element is less than pivot then index of -1 is increment by 1
                // Swap the less value position to current position of i
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }

        // for shifting pivot at positon of current index of i+1
        i++;
        // Swap the pivot
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
