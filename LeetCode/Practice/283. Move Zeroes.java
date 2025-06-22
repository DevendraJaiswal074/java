//https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75

/* 
class Solution {
    public void moveZeroes(int[] nums) {
        
        int last_value= -1;

        for(int i=0 ; i < nums.length ; ++i){
            
            //check the condition of zero
            if(nums[i]!=0){
                last_value++;

                //swap values
                int temp = nums[last_value];
                nums[last_value] = nums[i];
                nums[i] = temp;
            }

        }
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        // Arrays.sort(nums);
        int countRound = 0;

        for(int i = 0; i <nums.length ; i++){
            if(nums[i] == 0){
                countRound++;
            }
            else if(countRound>0){
                int temp = nums[i];
                nums[i] = 0;
                nums[i-countRound] = temp;
            }
        }
    }
}
*/