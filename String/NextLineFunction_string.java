package String;
// Use of Nextline function

import java.util.*;
public class NextLineFunction_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Your Name: ");

        String example2 = scan.nextLine(); // NextLine() function takes the sentence and print the all sentences/word

        System.out.println(example2);

        scan.close();
    }
    
}
