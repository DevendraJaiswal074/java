import java.util.*;
public class table {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number");
        int user =scan.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(user+"X"+i+"="+user*i);
        }
        scan.close();
    }
}
