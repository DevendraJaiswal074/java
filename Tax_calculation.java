import java.util.*;

public class Tax_calculation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Income Amount: ");
        
        int income = scan.nextInt();
        int tax=0;

        if (income < 500000) {
            tax = 0;
        }
        else if (income >= 500000 && income <= 1000000) {
            tax = (int)(income*0.2);
        }
        else{
            tax = (int)(income*0.3);
        }

        System.out.println("tax equal to ="+tax);
    }
}