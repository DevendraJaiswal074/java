package LeetCode.July2025;

// https://leetcode.com/problems/find-the-original-typed-string-i/?envType=daily-question&envId=2025-07-01

class Solution {
    public int possibleStringCount(String word) {
        int Tcount = 0;

        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) == word.charAt(i-1)){
                Tcount++;
            }
        }

        return Tcount+1;
    }
}