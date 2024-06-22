// Java program to remove duplicate alphabets from a string using recursion and print the modified string:

// "hello" then,output will be "helo"

public class Recursion_remove_duplicate {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + removeDuplicates(str, ""));
    }

    public static String removeDuplicates(String str, String result) {
        if (str.length() == 0) {
            return result;
        }

        char ch = str.charAt(0);
        if (!result.contains(String.valueOf(ch))) {
            result += ch;
        }

        return removeDuplicates(str.substring(1), result);
    }
}