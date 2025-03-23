//Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up. 

package Recursion;

public class Friends_pairing_problem {

    public static int cal_pairing(int n ){

        if (n == 1 || n == 2) {  // Base case
            return n;
        }

        //single partner
        int num1 = cal_pairing(n-1);

        //pairing partners
        int num2 = cal_pairing(n-2);
        int pairing = (n-1)*num2;

        int totalways = num1+pairing;
        return totalways;

        // return cal_pairing(n-1) +  (n-1)*cal_pairing(n-2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(cal_pairing(n));
    }
}
