import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Day 11: 2D Arrays
// Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

public class Day11 {
   private void findMaxSum(int ar[][]){
      int i, j, maxSum = Integer.MIN_VALUE, currSum = Integer.MIN_VALUE;
      for(i = 0; i < ar.length - 2 ; i++){
         for(j = 0; j < ar[0].length - 2; j++){
            currSum = ar[i][j]+ar[i][j+1]+ar[i][j+2]+ar[i+1][j+1]+ar[i+2][j]+ar[i+2][j+1]+ar[i+2][j+2];
            //System.out.println("currsum = " + currSum);
            if(currSum>maxSum)
               maxSum = currSum;
         }
      }
      System.out.println(maxSum);
   }
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int arr[][] = new int[6][6];
      for(int i=0; i < 6; i++){
         for(int j=0; j < 6; j++){
            arr[i][j] = in.nextInt();
         }
      }
      Day11 s = new Day11();
      s.findMaxSum(arr);
      in.close();
   }
}