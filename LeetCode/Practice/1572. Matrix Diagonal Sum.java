// https://leetcode.com/problems/matrix-diagonal-sum/

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        for(int i = 0; i< mat.length; i++){
            for(int j = 0; j< mat[0].length; j++){
                if(i == j){
                    sum += mat[i][j]; 
                }
                else if(i+j == mat.length-1){
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    }
}

/*  2nd approach

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        for(int i = 0; i < mat.length; i++){
            //primary diagonal
            sum += mat[i][i];

            //secondary diagonal
            if(i != mat.length-i-1){
                sum += mat[i][mat.length-i-1];
            }
        }

        return sum;
    }
}

*/