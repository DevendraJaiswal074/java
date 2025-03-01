package Practice;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("User value = ");
        int user = scan.nextInt();
        
        String test = (user%2==0)?"even":"odd";
        System.out.println("result are : "+ test);
        scan.close();
    }
}
