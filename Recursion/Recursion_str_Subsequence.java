package Recursion;
// print all the subsequence of a string "dev"
/*OUTPUT
dev
de
dv
d
ev
e
v

 */

public class Recursion_str_Subsequence {

    public static void subsequence(String str, int index, String new_str) {
        if (index == str.length()) {
            System.out.println(new_str);
            return;
        }
        char current_char = str.charAt(index);

        subsequence(str, index + 1, new_str + current_char);
        subsequence(str, index + 1, new_str);

    }

    public static void main(String[] args) {
        String str = "dev";
        subsequence(str, 0, "");
    }

}