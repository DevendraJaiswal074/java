/*

* 
**
***
**
*

 */
 
public class gotos {  
    public void prints(int a){
        //u
        for (int i = 1; i < a; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //d
        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        gotos obj = new gotos();
        obj.prints(3);
    }
    
}