package Recursion;
//print the string in reverse order using recursion

import java.util.*;
public class Recursion_str_reverse {
    public static void print_str_reverse(String user,int index) {
        if (index == 0) {                         // Base case
            System.out.print(user.charAt(0));      // print the last value of reverse
            return;                          // exit the function
        }
        System.out.print(user.charAt(index));
        print_str_reverse(user, index-1);           
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String user = scan.next();
        print_str_reverse(user, user.length()-1);
        scan.close();
    }
}