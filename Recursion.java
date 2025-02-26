// Print 5 to 1 number use of resursion function

public class Recursion {
    public static void Print_Number(int n){       // print_number is a recursion function 
        if (n==0) {                               // if check the condition 
            return;
        }
        System.out.println(n);    // print the value which are store and replace when function is called 
        Print_Number(n-1);        // n-1 is decrese the value by 1 
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Number in reverse order:-");
        Print_Number(number);  // call the function with value 
    }
}