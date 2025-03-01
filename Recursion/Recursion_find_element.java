package Recursion;
//print the index of the first and last index or 'a'  at the string "abdsudadvaavidva"

public class Recursion_find_element {
    public static int first = -1;           
    public static int last = -1;
    public static void print_searchvalue_index(String str, int index, char search_value) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);                // last index value whatever its store print
            return;
        } 
        char curent_value = str.charAt(index);
        if (curent_value == search_value) {
            if (first == -1) {
                first = index;
            }
            else{
                last = index;
            }
        }
        print_searchvalue_index(str, index+1, search_value);
    }
    public static void main(String[] args) {
        String str = "abdsudadvaavidva";
        char search_value = 'a';
        print_searchvalue_index(str, 0, search_value);
    }
}