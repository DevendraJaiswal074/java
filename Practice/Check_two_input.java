package Practice;
import java.util.*;

public class Check_two_input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = scan.nextInt();
        System.out.print("Enter second number:");
        int b = scan.nextInt();

        if (a==b) {
            System.out.println("EQUAL");        
        }
        else if (a>b) {
            System.out.println("A value is Greater"); 
        }
        else{
            System.out.println("A value is lesser");
        }
        scan.close();
    }
}
