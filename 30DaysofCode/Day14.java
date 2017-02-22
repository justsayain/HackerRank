import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Day 14: Scope

class Difference {
   private int[] elements;
   public int maximumDifference;
   	// Add your code here
   Difference (int[] nums){
      this.elements = nums.clone();
   }

   public void computeDifference(){
      int diff = 0;
      int j =0;
      for(int i = 0; i < elements.length; i++){
         while(j < elements.length - 1){
            diff = Math.abs(elements[i]-elements[j+1]);
            if(maximumDifference < diff)
               maximumDifference = diff;
            j++;
         }
         j = 0;
      }
   }

   public String maximumDifference(){
      return Integer.toString(maximumDifference);
   }
} // End of Difference class

public class Day14 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
         a[i] = sc.nextInt();
      }
      sc.close();
   
      Difference difference = new Difference(a);
   
      difference.computeDifference();
   
      System.out.print(difference.maximumDifference);
   }
}