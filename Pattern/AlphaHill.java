package Pattern;

// https://www.naukri.com/code360/problems/alpha-hill_6581921?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION

public class AlphaHill {
    public static void alphaHill(int n) {
        // Write your code here
        for(int i = 1 ; i <= n ; i++){
            for(int space = 1;space <= n-i; space++){
                System.out.print("  "); 
            }
 
            char ch = 'A';
            for(int j = 1 ; j<= i ; j++){ 
                System.out.print(ch+" ");
                ch++;
            }

            ch-=2;
            for(int j = 1; j<i ;j++){ 
                System.out.print(ch+" "); 
                ch--;
            }

            System.out.println();
        }
    }
}
