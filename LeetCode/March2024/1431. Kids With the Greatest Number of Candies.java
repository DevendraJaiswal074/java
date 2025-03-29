//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        // loop to find max value of a array
        int max=candies[0];
        for (int i = 1; i < candies.length; i++){
            if (candies[i] > max){
                max = candies[i];
            } 
        }
        
        for(int i= 0;i<candies.length;i++){

            if(candies[i] + extraCandies >= max) {
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}