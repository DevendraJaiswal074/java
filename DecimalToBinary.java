import java.util.Scanner;

public class DecimalToBinary {

    public static void DecToBin(int DecimalNo){
        int bin = 0;
        int pow = 0;
        int valueDecimal =DecimalNo;

        while (DecimalNo > 0) {
            int rem = DecimalNo % 2;
            bin = bin + (rem* (int) Math.pow(10,pow));
            pow++;
            DecimalNo = DecimalNo/2;
        }

        System.out.print("Decimal number "+valueDecimal+" to Binary is "+bin);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Decimal number to Binary number");
        System.out.print("Decimal value = ");
        int user = scan.nextInt();
        DecToBin(user);
    }
}
