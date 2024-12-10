public class Pattern_Ascending_triangle_number2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            n--;
            System.out.println();
        }
    }
}
