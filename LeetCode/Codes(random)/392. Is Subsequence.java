//https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean isSubsequence(String s, String t) {
        int length_t = t.length() , length_s = s.length();

        int i=0,j=0;
        while (i < length_s && j < length_t){
            if(s.charAt(i)==t.charAt(j)){
                ++i;
            }
            ++j;
        }

        return i == length_s;

    }
}