// A subarray of an n-element array is an array composed from a contiguous block of the original array’s elements. For example, if array = [1,2,3], then the subarrays are [1], [2], [3], [1,2], [2,3], and [1,2,3]. Something like [1,3]would not be a subarray as it’s not a contiguous subsection of the original array.
// The sum of an array is the total sum of its elements.
// An array’s sum is negative if the total sum of its elements is negative.
// An array’s sum is positive if the total sum of its elements is positive.

import java.io.*;
import java.util.*;

public class Hackerrank_Subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,sum=0,c=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum+=a[k];
                   
                }
                 if(sum<0)c++;
            }
        }
        System.out.print(c);
    }
    
}