import java.util.*;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = scan.nextInt();

        if (a%2==0) {
            System.out.println(a+" is EVEN number");        
        }
        else{
            System.out.println(a+" is ODD number");
        }
        scan.close();

        
    }
    
}
