// print x power n using recursion
public class RecursionXpower {
    public static int powers(int x ,int n){
        if(n == 0){
            return 1;
        }
        else{
            return x * powers(x, n-1); 
        }
    }
    public static void main(String[] args) {
        System.out.println(powers(2, 10));
    }
}