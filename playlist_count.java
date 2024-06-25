import java.util.*;

public class playlist_count {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scan.nextInt();
        }

        int count = 0;
        for (int j = 0; j < array.length-1; j++) {
            if (array[j]==array[j+1]) {
                count = count +1;
            }
        }
        System.out.println(count);


        scan.close();
    }
}