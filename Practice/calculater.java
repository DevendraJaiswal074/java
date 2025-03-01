package Practice;
import java.util.*;

public class calculater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("                     CALCULATOR          ");
        System.out.println(" 1 For ADD               |   2 For SUBTRACT");
        System.out.println(" 3 For MULTIPLICATION    |   4 For DIVIDE");
        System.out.println(" 5 FOR EXIT");

        int N_terms = 0;
        while (N_terms < 5) {
            System.out.print("Enter your choice:");
            int user = scan.nextInt();

            switch (user) {
                case 1:
                    System.out.println("Enter Number For ADD");
                    System.out.println("\n");
                    System.out.print("Enter First Number:");
                    int a = scan.nextInt();
                    System.out.print("Enter second Number:");
                    int b = scan.nextInt();
                    int sum = a + b;
                    System.out.println("\n");
                    System.out.println("AFTER ADDING THE RESULT IS = " + sum);
                    break;

                case 2:
                    System.out.println("Enter Number For SUBTRACTION ");
                    System.out.println("\n");
                    System.out.print("Enter First Number:");
                    int a1 = scan.nextInt();
                    System.out.print("Enter second Number:");
                    int b1 = scan.nextInt();
                    int sum1 = a1 - b1;
                    System.out.println("\n");
                    System.out.println("AFTER SUBTRACTION THE RESULT IS = " + sum1);
                    break;

                case 3:
                    System.out.println("Enter Number For MULTIPLICATION");
                    System.out.println("\n");
                    System.out.print("Enter First Number:");
                    int a2 = scan.nextInt();
                    System.out.print("Enter second Number:");
                    int b2 = scan.nextInt();
                    int sum2 = a2 * b2;
                    System.out.println("\n");
                    System.out.println("AFTER MULTIPLICATION THE RESULT IS = " + sum2);
                    break;

                case 4:
                    System.out.println("Enter Number For DIVIDE");
                    System.out.println("\n");
                    System.out.print("Enter First Number:");
                    float a3 = scan.nextFloat();
                    System.out.print("Enter second Number:");
                    float b3 = scan.nextFloat();
                    float sum3 = a3 / b3;
                    System.out.println("\n");
                    System.out.println("AFTER DIVIDE THE RESULT IS = " + sum3);
                    break;
            }
            if (user == 5) {
                N_terms = 5;
            } 
            else {
                System.out.println("\n");
                System.out.println("You Want Calculate Again..? Yes/No");
                System.out.println(" ~Press 1 for 'Yes'");
                System.out.println(" ~Press 2 for 'No'");
                System.out.print("Press- ");
                int user2 = scan.nextInt();
                if (user2 == 1) {
                    N_terms = 0;
                } else if (user2 == 2) {
                    N_terms = 5;
                    System.out.println("THANK FOR USING");
                }

                else {
                    System.out.println("wrong entered .....!");
                }
                System.out.println("______________________________________________________");
            }
        }
        scan.close();
    }
}
