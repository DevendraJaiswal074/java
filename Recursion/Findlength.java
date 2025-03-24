// Write a program to findLength of a Stringusing Recursion

package Recursion;

public class Findlength {
    public static int StringLength(String str){
        if (str.length() == 0) {
            return 0;
        }
        return 1 + StringLength(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(StringLength("hello"));
    }
}
