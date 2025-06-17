//https://www.naukri.com/code360/problems/alpha-ramp_6581888?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION

package Pattern;

class Alpha {
    public static void alphaRamp(int n) {
        // Write your code here
        for(int i = 0; i< n; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print((char)('A'+i)+" ");
            }
            System.out.println();
        }
    }
}