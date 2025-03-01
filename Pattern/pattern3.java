package Pattern;
/* Print the following pattern

*
**
***
****

 */

public class pattern3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
