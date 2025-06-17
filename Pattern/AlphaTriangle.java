package Pattern;

//https://www.naukri.com/code360/problems/alpha-triangle_6581429?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM

public class AlphaTriangle {
        public static void alphaTriangle(int n) {
        // Write your code here
        char startvalue = (char)('A'+n-1); // use to store highest value of char using n
        for(int i = 1 ; i <= n; i++){
            char chvalue = startvalue; // store to implement
            for(int j = 0 ; j<i; j++){
                System.out.print(chvalue + " ");
                chvalue--; // dec the value to print the pattern
            }
            System.out.println();
        }
    }
}
