package Pattern;

//https://www.naukri.com/code360/problems/reverse-letter-triangle_6581906?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM

public class ReverseLetterTriangle {
        public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i = n ; i>= 1 ;i--){
            for(int j = 0 ; j<i; j++){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}
