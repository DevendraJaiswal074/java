import java.util.Scanner;

public class InputUser {
    public static void main(String[] argu) {
        System.out.println("Taking input from the user");
        Scanner val = new Scanner(System.in);
        System.out.println("Enter The First Value");
        int a = val.nextInt();
        System.out.println("Enter The Second Value");
        int b = val.nextInt();

        System.out.print("The sum of a,b is :");
        System.out.println(a+b);

        val.close();
    }
}
