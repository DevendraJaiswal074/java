import java.util.*;
public class Postive_and_negative {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("user value = ");
        int user = scan.nextInt();

        if (user < 0) {
            System.out.println(user +" is negative number");
        }
        else{
            System.out.println(user +" is postive number");
        }
    }
}
