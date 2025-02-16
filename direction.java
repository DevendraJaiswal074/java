import java.util.*;

public class direction {
    public static float dir(String str){
        int x=0,y=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)== 'n') {
                y= y+1;
            }
            else if (str.charAt(i)=='e') {
                x=x+1;
            }
            else if(str.charAt(i)=='w'){
                y= y+1;
            }
            else{
                x=x+1;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] arg){
        String str = "ns";
        System.out.println(dir(str));
    }
}