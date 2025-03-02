// https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/?envType=daily-question&envId=2025-03-02

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> res = new ArrayList<>();
        int p1 = 0, p2 = 0;
        int m = nums1.length, n = nums2.length;

        while (p1 < m && p2 < n) {
            if (nums1[p1][0] == nums2[p2][0]) {
                res.add(new int[]{nums1[p1][0], nums1[p1][1] + nums2[p2][1]});
                p1++;
                p2++;
            } else if (nums1[p1][0] < nums2[p2][0]) {
                res.add(nums1[p1]);
                p1++;
            } else {
                res.add(nums2[p2]);
                p2++;
            }
        }

        // Fill leftover from nums1
        while (p1 < m) {
            res.add(nums1[p1]);
            p1++;
        }

        // Fill leftover from nums2
        while (p2 < n) {
            res.add(nums2[p2]);
            p2++;
        }

        // Convert List<int[]> to int[][]
        int[][] result = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}