// given a "2*n" board and tile of size "2*1" count the number of ways to tile the given board using 2*1 tiles (A tile can either be placed horizontly and vertically).

package Recursion;
import java.util.Scanner;

public class Tiling_Problem {

    public static int placed_tiles(int n ){
            if (n == 0 || n == 1) {        //based case
                return 1;
            }
            int vertically = placed_tiles(n-1);
            int horizontly = placed_tiles(n-2);
    
            int sum = vertically+horizontly;
            return sum;
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number of tile");
            int n = scan.nextInt();
    
            System.out.println(placed_tiles(n));
            scan.close();
    }
}