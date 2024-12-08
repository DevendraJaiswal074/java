import java.math.*;
public class BinaryToDecimal {

    public static void bin_dec(int binaryNo){
        int binNum = binaryNo;
        int power=0;
        int ld=0; // ld(last digit of binary number)
        int decnum=0;

        while (binaryNo > 0) {
            ld = binaryNo % 10;
            decnum = decnum+(ld * (int) Math.pow(2,power));
            power++;
            binaryNo = binaryNo/10;
        }
        System.out.println("Binary "+binNum+" to decimal "+decnum);
    }
    public static void main(String[] args) {
        bin_dec(101);
    }
}
