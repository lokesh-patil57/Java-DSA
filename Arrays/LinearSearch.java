
public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==key) {
                return i ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int key = 9;

        int result = linearSearch(numbers, key);
        if (result==-1) {
            System.out.println("Key NOT found");
        } else {
            System.out.println("Key found at index:"+result);
        }
    }
}
