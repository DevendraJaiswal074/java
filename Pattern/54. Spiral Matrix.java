//https://leetcode.com/problems/spiral-matrix/

/* 
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow <= endrow && startcol <= endcol){

            //to print top of matrix
            for(int i = startcol; i<= endcol; i++){
                result.add(matrix[startrow][i]);
            }

            //right side 
            for(int j = startrow+1; j<= endrow; j++){
                result.add(matrix[j][endcol]);
            }

            //bottom 
            for(int k = endcol-1; k >= startcol ; k--){
                if(startrow == endrow){
                    break;
                }
                result.add(matrix[endrow][k]);
            }

            //left
            for(int k2 = endrow-1; k2 > startrow; k2--){
                if(startcol == endcol){
                    break;
                }
                result.add(matrix[k2][startcol]);
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }
        return result;
    }
}
*/