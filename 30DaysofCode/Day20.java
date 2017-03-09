import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//simple sorting algorithm called Bubble Sort.

public class Day20 {
   static int swaps = 0;
   public static void sort(int[] a){
      for(int i = 0; i < a.length; i++){
         int track = 0;
         for (int j = 0; j < a.length - 1; j++){
            if (a[j] > a[j + 1]) {
               swap(a[j], a[j+1], a, j);
               track++;
            }
         }
         if(track == 0)
            break;
      }
   }
   
   public static void swap(int a, int b, int[] array, int index){
      array[index] = b;
      array[index + 1] = a;
      swaps++;
   }
   
   public static void printOutput(int[] a){
      System.out.println("Array is sorted in " + swaps + " swaps.");
      System.out.println("First Element: " + a[0] + "\nLast Element: " + a[a.length-1]);
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int a_i=0; a_i < n; a_i++){
         a[a_i] = in.nextInt();
      }
      sort(a);
      printOutput(a);
   }
}
