package Practice;
import java.util.Scanner;

public class TrappedRainWater {
    public static void waterStored(int arr[]) {
        int maxLeft[] = new int[arr.length];
        maxLeft[0] = arr[0];

        for (int i = 1; i < arr.length; i++) { // max left
            maxLeft[i] = Math.max(arr[i], maxLeft[i - 1]);
        }

        int maxRight[] = new int[arr.length];
        maxRight[arr.length - 1] = arr[arr.length - 1];

        for (int j = arr.length-2; j >= 0; j--) { // max right
            maxRight[j] = Math.max(arr[j], maxRight[j + 1]);
        }

        int trappedWater = 0;
        for (int j2 = 0; j2 < arr.length; j2++) {
            int waterLevel = Math.min(maxLeft[j2], maxRight[j2]);
            trappedWater = trappedWater + waterLevel - arr[j2];
        }

        System.out.println("Trapped Rain Water = " + trappedWater);
    }

    public static void trapped_water(int arr[]) {
        if (arr.length < 2) {
            System.out.println("0 level of water are stored");
        } else {
            waterStored(arr);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Array[%d] =",i);
            arr[i] = scan.nextInt();
        }

        trapped_water(arr);
        scan.close();
    }
}