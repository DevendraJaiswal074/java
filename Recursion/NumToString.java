//You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem.NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0.
// Sample Input: 1947 Sample Output: “one nine four seven”

package Recursion;

public class NumToString {
    public static void NumberIntoString(int n) {
        String[] world = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        if (n == 0) { // base case
            return;
        }

        NumberIntoString(n / 10); // calling function and remove the last digits

        System.out.print(world[n % 10] + " "); // printing the last digit world

    }

    public static void main(String[] args) {
        int n = 2004;
        NumberIntoString(n);
    }
}
