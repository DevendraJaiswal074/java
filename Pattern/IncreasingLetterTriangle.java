package Pattern;

// https://www.naukri.com/code360/problems/increasing-letter-triangle_6581897?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION

public class IncreasingLetterTriangle {
        public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i = 1 ; i <= n ; i++){
            for(int j = 0; j < i ; j++){
                System.out.print((char)('A'+j)+ " ");
            }
            System.out.println();
        }
    }
}
