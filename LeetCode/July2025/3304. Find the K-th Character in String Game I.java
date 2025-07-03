//https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/?envType=daily-question&envId=2025-07-03

class Solution {
    public char kthCharacter(int k) {
        int idx = k - 1;
        StringBuilder result = new StringBuilder();
        result.append('a');

        while(result.length() < k) {
            int n = result.length();
            for(int i = 0; i < n; i++) {
                char ch = result.charAt(i) == 'z' ? 'a' : (char)(result.charAt(i) + 1);
                result.append(ch);
            }
        }

        return result.charAt(idx);
    }
}