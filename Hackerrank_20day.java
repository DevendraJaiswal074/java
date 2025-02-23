/*
 Given an array, a, of size n distinct elements, sort the array in ascending order using the Bubble Sort algorithm above. Once sorted, print the following 3 lines:

* Array is sorted in numSwaps swaps.
where numSwaps is the number of swaps that took place.
* First Element: firstElement
  where firstElement is the first element in the sorted array.
* Last Element: lastElement
  where lastElement is the last element in the sorted array.
  
  Hint: To complete this challenge, you will need to add a variable that keeps a running tally of all swaps that occur during execution.

 */
import java.util.*;

public class Hackerrank_20day {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int temp=0;
        int swapCount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapCount++;   
                }
                
            }
            if(swapCount==0){
                break;
            }
        }
                System.out.println("Array is sorted in "+swapCount+" swaps.");
                System.out.println("First Element: "+arr[0]);
                System.out.println("Last Element: "+arr[arr.length-1]);
            
            in.close();
        }
    }