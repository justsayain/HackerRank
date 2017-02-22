import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Day 9: Recursion
// Write a factorial function that takes a positive integer, n as a parameter and prints the result of n!(n factorial).

public class Day9 {
   public static int factorial(int k){
      int sum = 1;       
      if(k > 1){
         sum = k * factorial(k-1);
         return sum;
      }
      else{          
         return sum;
      }
   }
   public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      System.out.println(factorial(num));
   }
}