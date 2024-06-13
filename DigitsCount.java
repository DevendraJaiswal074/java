// use the while loop and print the sum of all digits

import java.util.*;
public class DigitsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number:");
        int user = scan.nextInt();

        int sum =0;
        while (user!=0) {
            sum =sum+user%10;
            user = user/10;    
        }
        System.out.println(sum);
        scan.close();

    }
    
}
