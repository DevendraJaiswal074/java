package String;
/*
 Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 */

class reverseString {
    public void reverseStrings(char[] s) {
        int start_string = 0;
        int last_string = s.length -1;

        while(start_string < last_string){
            char temp = s[start_string];
            s[start_string] = s[last_string];
            s[last_string] = temp;

            start_string ++;
            last_string --;
        }
    }
}