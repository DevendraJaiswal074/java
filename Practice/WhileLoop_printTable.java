package Practice;
// https://www.geeksforgeeks.org/problems/while-loop-printtable-java/1

/* 
While loop is another loop like for loop but unlike for loop it only checks for one condition.

Here, we will use a while loop and print a number n's table in reverse order.
*/


//User function Template for Java
class Geeks {
    static void printTable (int n) 
    {
           int multiplier=10;
           while(multiplier>0)
           {
               //Your code here
               System.out.print(multiplier*n+" ");
               multiplier--;
           }
      System.out.println();
    }
}