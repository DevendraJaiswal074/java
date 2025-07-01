//https://leetcode.com/problems/put-marbles-in-bags/description/?envType=daily-question&envId=2025-03-31

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        
        List<Integer> pairSum = new ArrayList<>();
        
        for (int i = 0; i < n - 1; i++) {
            pairSum.add(weights[i] + weights[i + 1]);
        }
        
        Collections.sort(pairSum);
        long maxSum = 0;
        long minSum = 0;
        
        for (int i = 0; i < k - 1; i++) {
            minSum += pairSum.get(i);
            maxSum += pairSum.get(n - i - 2);
        }
        
        return maxSum - minSum;
    }
}