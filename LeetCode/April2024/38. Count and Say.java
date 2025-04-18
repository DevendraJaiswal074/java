// https://leetcode.com/problems/count-and-say/submissions/1610793340/?envType=daily-question&envId=2025-04-18

class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String say = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < say.length(); i++) {
            int count = 1;
            char ch = say.charAt(i);

            while (i < say.length() - 1 && say.charAt(i) == say.charAt(i + 1)) {
                count++;
                i++;
            }

            result.append(count).append(ch);
        }

        return result.toString();
    }
}