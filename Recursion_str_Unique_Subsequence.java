// print all the unique subsequence of a string "aaa"
/*OUTPUT
aaa
aa
a
 */

 import java.util.HashSet;
 public class Recursion_str_Unique_Subsequence {

    public static void subsequence(String str, int index, String new_str, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(new_str)) {           //contains check the value are presenr or not
                return;
            }
            else{
                System.out.println(new_str);
                set.add(new_str);                  // add the char in new string
                return;
            }
        }
        char current_char = str.charAt(index);

        subsequence(str, index + 1, new_str + current_char , set);
        subsequence(str, index + 1, new_str , set);

    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String>set = new HashSet<>();        
        subsequence(str, 0, "", set);
    }

}