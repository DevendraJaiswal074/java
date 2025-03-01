package Function;
// Print the name using function

import java.util.*;

public class Function {

    public static void printname(String name){     // Creating function and give arguments name 
        System.out.println(name);
        return;          // for string write return and integers values write 1.
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name = scan.nextLine();

        printname(name);  // call the function 

        scan.close();
        
    }
    
}
