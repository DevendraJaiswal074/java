import java.util.Scanner;

public class Linear_Search {
    
    public static void search(int array[],int key){

        for (int i = 0; i < 10; i++) {
            if (array[i]==key) {
                System.out.println("Value found at Array["+i+"]["+array[i]+"]");
            }
        }
    }
    public static void main(String[] args) {
        int array[] = new int[10];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the search value = ");
        int key = scan.nextInt();

        for (int i = 0; i < 10 ; i++) {
            System.out.print("Array["+i+"] = ");
            array[i]= scan.nextInt();
        }

        search(array,key);
        scan.close();
    }
}
