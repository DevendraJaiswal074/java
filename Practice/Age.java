package Practice;
import java.util.*;
public class Age {
    public static void main(String[] args) {

        int ages= 18;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE:");
        int a = sc.nextInt();

        if (a >= ages) {
            System.out.println("You are Adult");
        }
        else{
            System.out.println("You are not adult");
        }
        sc.close();
    }
}
