/* https://leetcode.com/problems/count-symmetric-integers/description/?envType=daily-question&envId=2025-04-11

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int num = low; num <= high; num++) {
            String s = Integer.toString(num);
            int len = s.length();

            if (len % 2 != 0) {
                continue;
            }

            int leftSum = 0, rightSum = 0;

            for (int i = 0; i < len / 2; i++) {
                leftSum += s.charAt(i) - '0';
            }

            for (int i = len / 2; i < len; i++) {
                rightSum += s.charAt(i) - '0';
            }

            if (leftSum == rightSum) {
                count++;
            }
        }

        return count;
    }
}

//Approach-2 (Optimal using / and %)
//T.C : O(high-low+1)
//S.C : O(1)
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int num = low; num <= high; num++) {
            if (num >= 10 && num <= 99 && num % 11 == 0) {
                // 2-digit numbers divisible by 11 are symmetric
                count++;
            } else if (num >= 1000 && num <= 9999) {
                // 4-digit numbers: check left and right digit sum
                int first = num / 1000;
                int second = (num / 100) % 10;
                int third = (num / 10) % 10;
                int fourth = num % 10;

                if (first + second == third + fourth) {
                    count++;
                }
            }
        }

        return count;
    }
}

*/