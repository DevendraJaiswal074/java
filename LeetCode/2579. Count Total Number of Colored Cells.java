//https://leetcode.com/problems/count-total-number-of-colored-cells/description/?envType=daily-question&envId=2025-03-05


// Method 1 using long datatype
class Solution {
    public long coloredCells(int n) {
        long vals = n;
        return 1+(vals-1)* vals *2;
    }
}

// More easy way to write program without creating variable
class Solution {
    public long coloredCells(int n) {
        return 1+(long) n*(n-1) *2;
    }
}