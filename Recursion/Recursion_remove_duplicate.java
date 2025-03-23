package Recursion;
// Java program to remove duplicate alphabets from a string using recursion and print the modified string:

// "hello" then,output will be "helo"

public class Recursion_remove_duplicate {
    public static void main(String[] args) {
        String str = "hellohelllootyooorpprrrr";
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + removeDuplicates(str, ""));
    }

    public static String removeDuplicates(String str, String result) {
        if (str.length() == 0) {   // based case
            return result;
        }

        char ch = str.charAt(0);
        if (!result.contains(String.valueOf(ch))) {
            result += ch;
        }

        // calling function with substring of 1.
        // str = abcddea
        return removeDuplicates(str.substring(1), result); 
        /* now str = bcddea -at the 1st calling
           str = cddea  - 2nd calling of function.....

           result = a
           result = ab....
        */
    }
}