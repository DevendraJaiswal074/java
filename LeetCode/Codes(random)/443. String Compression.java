//https://leetcode.com/problems/string-compression/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int compress(char[] chars) {
        int size = chars.length;
        int idx = 0;
        int i = 0;

        while (i < size) {
            char ch = chars[i];
            int count = 0;

            // Count consecutive characters
            while (i < size && chars[i] == ch) {
                count++;
                i++;
            }

            // Add the character to the compressed array
            chars[idx++] = ch;

            // Add the count if greater than 1
            if (count > 1) {
                String str = String.valueOf(count);
                for (char digit : str.toCharArray()) {
                    chars[idx++] = digit;
                }
            }
        }

        return idx;
    }
}
