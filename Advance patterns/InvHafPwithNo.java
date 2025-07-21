
public class InvHafPwithNo {
    public static void Inverted_half_py_withNo(int n) {
        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Inverted_half_py_withNo(5);
    }
}
