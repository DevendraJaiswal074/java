// The first line contains a single string denoting s.
// The second line contains two space-separated integers denoting the respective values of start and end
//Sample Input
// Helloworld
// 3 7
// Sample Output
// lowo

import java.util.*;

public class Hackerrank_substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));

        in.close();
    }
}