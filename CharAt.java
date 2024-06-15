//print the charaters of a string using the funtion of charAt and also print the length of a string 

import java.util.*;

public class CharAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scan.nextLine();

        for (int i = 0; i < name.length(); i++) {    // name.length() used to know the size of string
            System.out.println(name.charAt(i));      // CharAt() function is use to go One-By-One charater of a string/sentence
        }
        System.out.print(name.length());      // length function is use to know the length of a string
        scan.close();
    }
}