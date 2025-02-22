// Best time to buy and sell the stock. important question 

import java.util.Scanner;

public class StockProfit {

    public static void cal_profit(int arr[]){
        int buyProfit = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (buyProfit < arr[i]) {
                int profit = arr[i] - buyProfit;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyProfit = arr[i];
            }
        }
        System.out.println("The profit of all Stock are : "+maxProfit);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Total no. of stocks to be calculate : ");
        int size = scan.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1)+" Stock Price = ");
            arr[i] = scan.nextInt();
        }

        cal_profit(arr);
        scan.close();

    }
}
