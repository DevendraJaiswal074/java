// move all 'x' of a string at the end and print 

public class Recursion_str_moveEnd {
    public static int count = 0;
    public static void move_str(String str,int index) {
        if (index== str.length()) {
            for (int i = 0; i < count; i++){
                System.out.print("x");
            }
            return;
        }
        if (str.charAt(index) == 'x') {
            count = count +1;
        }
        else{
            System.out.print(str.charAt(index));
        }
        move_str(str, index+1);

    }
    
    public static void main(String[] args) {
        String str = "ausxxahdxx";
        move_str(str, 0);
    }
}