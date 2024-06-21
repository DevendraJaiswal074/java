// print sum of first n natural number.

import java.util.*;
public class Recursion_sum {
    public static void Natural_Number(int i,int user,int sum) {
        if (i==user) {                
            sum+=i;              // sum = sum+i;
            System.out.println("Sum of n natural number are = "+sum);
            return;             // break
        }
        sum = sum+i;
        Natural_Number(i+1, user, sum);   // increse the value of i for contious process

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'N' value: ");
        int user = scan.nextInt();                // take input from user
        Natural_Number(1,user,0);                     // call the function
        scan.close();
    }
    
}
