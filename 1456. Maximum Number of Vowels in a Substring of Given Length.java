//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0, currentVowels = 0;
        // Check each character in the string
        for (int i = 0; i < s.length(); i++) {
            // If the character is a vowel, increase the current vowel count
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
            if (i >= k && isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            // Update the maximum number of vowels found
            maxVowels = Math.max(maxVowels, currentVowels);
        }
        return maxVowels;
    }
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}