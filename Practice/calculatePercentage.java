package Practice;
import java.util.Scanner;

public class calculatePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Subject Number:");
        float s1 = sc.nextFloat();
        System.out.print("Enter The Second Subject Number:");
        float s2 = sc.nextFloat();
        System.out.print("Enter The Third Subject Number:");
        float s3 = sc.nextFloat();
        System.out.print("Enter The Fourth Subject Number:");
        float s4 = sc.nextFloat();
        System.out.print("Enter The LastOne Subject Number:");
        float s5 = sc.nextFloat();

        System.out.println("The total percentage are =");
        float total = s1 + s2 + s3 + s4 + s5;
        float percentage = (float)((total / 500.0) * 100);
         System.out.println(percentage);

         sc.close();
    }

}
