//https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverseArray(nums, 0, n-1); 

        reverseArray(nums, 0, k-1);

        reverseArray(nums, k , n-1);
    }

    public void reverseArray(int[] nums, int s , int e){

        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;

            s++;
            e--;
        }
    }
}