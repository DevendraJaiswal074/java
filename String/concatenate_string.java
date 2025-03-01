package String;
// concatenate two string 

import java.util.*;
public class concatenate_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the contents: ");
        String s1 =scan.nextLine();
        System.out.print("Enter the contents: ");
        String s2 = scan.nextLine();

        System.out.println(s1+" "+s2);  //concatenate two string 

        String concatenate = s1+s2;  //concatenate two string using third variable
        System.out.println(concatenate);

        scan.close();
    }
    
}
