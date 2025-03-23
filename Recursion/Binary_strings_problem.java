// Print all binary string of size N without consecutive 1s.

package Recursion;

public class Binary_strings_problem {

    public static void count_BinString(int n , int lastplace , String str ){

        if (n == 0) {               // base case
            System.out.println(str);
            return;
        }

        count_BinString(n-1, 0, str+"0");
        if (lastplace == 0) {
            count_BinString(n-1,1, str+"1");            
        }
    }

    public static void main(String[] args) {
        int n = 3;
        count_BinString(n,0,"");
    }
}
