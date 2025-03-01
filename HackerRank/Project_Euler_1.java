package HackerRank;
// https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem?isFullScreen=true

import java.util.*;

public class Project_Euler_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum = 0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            for (int i = 1; i < n; i++) {
                if (i%3==0 || i%5==0) {
                    sum = sum+i;
                }
            }
            System.out.println(sum);
        }
        in.close();
    }
}