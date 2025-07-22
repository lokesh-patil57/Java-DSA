package Arrays;

public class ArrayArgum {
    public static void update(int marks[], int nonchangable) {
        nonchangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {94,95,96};
        // call by referance
        int nonchangable = 5;
        update(marks , nonchangable);
        //print out update marks
        System.out.println(nonchangable);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
