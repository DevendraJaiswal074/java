//https://leetcode.com/problems/count-days-without-meetings/?envType=daily-question&envId=2025-03-24

import java.util.Arrays;

class Solution {
    public int countDays(int days, int[][] meetings) {

        Arrays.sort(meetings, (a,b) -> Integer.compare(a[0],b[0]));  // sorting the 2d array

        int totalOff =0;   //total number of daysoff 
        int endValue = 0;  // store the end value of array[][end value];

        for(int[] meet : meetings){ 
            if(meet[0] > endValue){
                totalOff+= meet[0]-endValue-1;
            }
            endValue = Math.max(endValue,meet[1]);
        }

        if(days > endValue){
            totalOff+= days-endValue;
        }

        return totalOff;
    }
}