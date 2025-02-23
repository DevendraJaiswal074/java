// check the number is even or odd using bitmask and bitwise opraters.
public class BitManipulation {
    public static void calculate(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        calculate(3);
        calculate(6);
        calculate(11);
        calculate(2);
    }
}
