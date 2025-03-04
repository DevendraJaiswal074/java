// https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/?envType=daily-question&envId=2025-03-04

class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n>0) {
            if (n%3 > 1) {
                return false;
            }
            else{
                n/=3;
            }
        }
        return true;
    }
}