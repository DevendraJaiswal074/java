// use the substring function and perform the oprations on the string

public class SubString_function {
    public static void main(String[] args) {
        
        String name = "Dev jaiswal";    // created a string variables

        // index 0 to 3 gives the output = Dev.
        String results = name.substring(0, 3);  // using the substring to print some charaters from beginIndex to EndIndex.

        System.out.println(results);  // print the variable which are store the value of substring.

        String result2 = name.substring(4);  // By default EndIndex goes to end of string.
        System.out.println(result2); // output produce jaiswal 

    }
    
}
