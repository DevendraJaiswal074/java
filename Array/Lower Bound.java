

//https://takeuforward.org/plus/dsa/problems/lower-bound-

class Solution {
    public int lowerBound(int[] nums, int x) {

        int leftSide = 0;
        int rightSide = nums.length;

        while(leftSide < rightSide){
            int mid = leftSide + (rightSide-leftSide)/2;

            if(nums[mid]<x){
                leftSide = mid+1;
            }
            else{
                rightSide = mid;
            }
        }
        return leftSide;
     }
}

