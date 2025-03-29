//https://leetcode.com/problems/minimum-index-of-a-valid-split/description/?envType=daily-question&envId=2025-03-27

import java.util.List;

class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();

        int maj = -1;
        int count = 0;

        // Step 1: Find majority element using Boyer-Moore Voting Algorithm
        for (int num : nums) {
            if (count == 0) {
                maj = num;
                count = 1;
            } else if (num == maj) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Count how many times majority element occurs
        int majCount = 0;
        for (int num : nums) {
            if (num == maj) {
                majCount++;
            }
        }

        // Step 3: Try splitting at every index to check conditions
        count = 0;
        for (int i = 0; i < n; i++) {
            if (nums.get(i) == maj) {
                count++;
            }

            int remainingCount = majCount - count;
            int n1 = i + 1;
            int n2 = n - i - 1;

            if (count * 2 > n1 && remainingCount * 2 > n2) {
                return i;
            }
        }

        return -1;
    }
}


// second approch 

/*
class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();

        HashMap<Integer, Integer> mp1 = new HashMap<>(); // stores elements of left subarray 
        HashMap<Integer, Integer> mp2 = new HashMap<>(); // stores elements of right subarray

        for (int num : nums) {
            mp2.put(num, mp2.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            int num = nums.get(i);

            mp1.put(num, mp1.getOrDefault(num, 0) + 1);
            mp2.put(num, mp2.get(num) - 1);

            int n1 = i + 1;
            int n2 = n - i - 1;

            if (mp1.get(num) * 2 > n1 && mp2.get(num) * 2 > n2) {
                return i;
            }
        }

        return -1;
    }
}  */
