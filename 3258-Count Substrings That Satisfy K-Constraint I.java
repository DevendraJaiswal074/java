/* 
You are given a binary string s and an integer k.

A binary string satisfies the k-constraint if either of the following conditions holds:

The number of 0's in the string is at most k.
The number of 1's in the string is at most k.
Return an integer denoting the number of 
substrings
 of s that satisfy the k-constraint.

 

Example 1:

Input: s = "10101", k = 1

Output: 12

Explanation:

Every substring of s except the substrings "1010", "10101", and "0101" satisfies the k-constraint.

Example 2:

Input: s = "1010101", k = 2

Output: 25

Explanation:

Every substring of s except the substrings with a length greater than 5 satisfies the k-constraint.

Example 3:

Input: s = "11111", k = 1

Output: 15

Explanation:

All substrings of s satisfy the k-constraint.

 */

 class Solution {
    public int countKConstraintSubstrings(String s, int k) {
   int n = s.length();
	int sum = n;

	int i=0, j=0, one=0, zero=0;
	char ch = '-';

	while(j < n) {
		ch = s.charAt(j++);
		if(ch == '0') zero++;
		else one++;

		while(i<=j && one>k && zero>k) {
			ch = s.charAt(i++);
			if(ch == '0') zero--;
			else one--;
		}

		int len = (zero+one-1);
		sum += len;
	}

	return sum;
    }
}