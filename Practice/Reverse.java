package Practice;
// Print the table in reverse order

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int user = take.nextInt();

        for (int i = 10; i >=1 ; i--) {
            System.out.println(user+"X"+i+"="+user*i);
        }
        take.close();
    }
    
}
