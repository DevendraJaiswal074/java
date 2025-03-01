package Pattern;
/*Print the pattern
 
    ****
   ****
  ****
 ****

 */

public class Pattern11 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
