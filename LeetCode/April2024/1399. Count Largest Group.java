// https://leetcode.com/problems/count-largest-group/description/?envType=daily-question&envId=2025-04-23

/*
 import java.util.HashMap;

class Solution {
    public int findDigitsSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSize = 0;
        int count = 0;

        for (int num = 1; num <= n; num++) {
            int digitsSum = findDigitsSum(num);
            map.put(digitsSum, map.getOrDefault(digitsSum, 0) + 1);

            if (map.get(digitsSum) == maxSize) {
                count++;
            } else if (map.get(digitsSum) > maxSize) {
                maxSize = map.get(digitsSum);
                count = 1;
            }
        }

        return count;
    }
}

 */