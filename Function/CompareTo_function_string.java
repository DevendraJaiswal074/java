package Function;
// Use the compareTo function 

import java.util.*;
public class CompareTo_function_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the contents: ");
        String s1 =scan.nextLine();
        System.out.print("Enter the contents: ");
        String s2 = scan.nextLine();

        /*  The function compareTo() use to compare two string are equal , greater , smaller.
            1. string_one == string_two then return 0.
            2. string_one > string_two then return +ve value.
            3. string_one < string_two then return -ve value.
        */

        //1. string_one == string_two then return 0.
        if (s1.compareTo(s2)==0) {
            System.out.println("Both String are equal");
        }
        else{
            System.out.println("not equal");
        }

        //2. string_one > string_two then return +ve value.
        if (s1.compareTo(s2) > 1) {
            System.out.println("string one is greater");
        }
        else{
            System.out.println("string one is smaller");
        }

        //3. string_one < string_two then return -ve value.

        if (s1.compareTo(s2) < -1) {
            System.out.println("string two is greater");
        }
        else{
            System.out.println("string one is smaller");
        }

        scan.close();
    }
    
}
