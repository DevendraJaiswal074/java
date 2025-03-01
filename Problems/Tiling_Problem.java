package Problems;
// given a "2Xn" floor of ground and tiles of size "2X1", count the number of ways to tile the green board using 2X1 tiles(tile can either be placed horizontly or vertically).

import java.util.*;
public class Tiling_Problem {

    public static int tilePlaced(int n){
        //base case
        if (n ==0 || n==1) {
            return 1;
        }

        int num1 = tilePlaced(n-1); // Horizontly tiles placed
        int num2 = tilePlaced(n-2); // Vertically tiles placed

        int totalWays = num1+num2; // Horizontly and Vertically tiles placed on floor

        return totalWays;
        
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = inputs.nextInt();
        System.out.println(tilePlaced(n));
        inputs.close();
    }
}