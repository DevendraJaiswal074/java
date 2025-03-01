package Practice;
/*
https://leetcode.com/problems/palindrome-number/description/

Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

 */
class palindrome_number {
    public boolean isPalindrome(int x) {
        int reverse_order =0;
        int original_order = x;
        int remainder;

        while (x > 0) {
            remainder = x % 10;
            reverse_order = reverse_order * 10 + remainder;
            x = x / 10;
        }
        if(reverse_order == original_order){
           return true;
        }
        else{
            return false;
        }
    }
}