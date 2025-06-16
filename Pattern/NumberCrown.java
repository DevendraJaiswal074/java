package Pattern;

public class NumberCrown {
    public static void numberCrown(int n) {
        // Write your code here.
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j + " ");
            }

            int space = 2*(n-i);
            for(int k = 1; k <= space ; k++){
                System.out.print("  ");
            }

            for(int j = i ; j >= 1 ; j--){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}