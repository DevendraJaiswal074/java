// Print 1 to 5 number use of resursion function

public class Recursion_1 {
    public static void Print_Number(int n){       // print_number is a recursion function 
        if (n==6) {                               // if check the condition 
            return;
        }
        System.out.println(n);    // print the value which are store and replace when function is called 
        Print_Number(n+1);        // n+1 is increase the value by 1
    }
    public static void main(String[] args) {
        int number = 1;
        System.out.println("Number in reverse order:-");
        Print_Number(number);  // call the function with value 
    }
}