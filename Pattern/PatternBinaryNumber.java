package Pattern;

//https://www.naukri.com/code360/problems/binary-number-triangle_6581890?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM


public class PatternBinaryNumber {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        for(int i = 1 ; i<= n; i++ ){
            int value;
            if(i%2==1){
                value = 1;
            }
            else{
                value = 0;
            }
            for(int j = 1; j<= i ; j++){
                System.out.print(value + " ");
                value = 1-value;
            }
            System.out.println();
        }
    }
}
