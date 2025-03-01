package Interviewbit;
// Given an integer M perform the following conditional actions:

// If M is multiple of 3 and 5 then print "Good Number" (without quotes).
// If M is only multiple of 3 and not of 5 then print "Bad Number" (without quotes).
// If M is only multiple of 5 and not of 3 then print "Poor Number" (without quotes).
// If M doesn't satisfy any of the above conditions then print "-1" (without quotes).

// import java.lang.*;
import java.util.*;

public class interviewbit {
    public static void main(String[] args) {
        /*** Don't change the code here ***/

        Scanner inp = new Scanner(System.in);
        int M = inp.nextInt();
        inp.close();
        /*********************************/

        /** Write your code here **/
        if (M % 3 == 0 && M % 5 == 0) {
            System.out.print("Good Number");
        } else if (M % 3 == 0 && M % 5 != 0) {
            System.out.print("Bad Number");
        } else if (M % 5 == 0 && M % 3 != 0) {
            System.out.print("Poor Number");
        } else {
            System.out.print("-1");
        }
    }
}
