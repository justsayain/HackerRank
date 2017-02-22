import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Day 10: Binary Numbers
// Given a base-10 integer, n , convert it to binary (base-2). 
// Then find and print the base-10 integer denoting the maximum
// number of consecutive 1's in n's binary representation

public class Day10 {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      String bin = Integer.toBinaryString(n);
      int count = 0;
      int max = 0;
      for(int i = 0; i < bin.length(); i++) {
         if(bin.charAt(i) == '1'){
            count++;
            if(max<count)
               max = count;
         }
         else{
            count = 0;
         }
            
      }
      System.out.println(max);
   }
}