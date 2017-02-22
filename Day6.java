import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {
   public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner input = new Scanner(System.in);
      int a = input.nextInt();
      input.nextLine();     //clear input buffer.
      String[] sArray = new String[a];
      for(int i=0;i<a;i++){
         sArray[i]=input.nextLine();
         String string1="",string2="";
         for(int j=0;j< sArray[i].length();j++){
            if(j%2==0)
               string1 = string1+sArray[i].charAt(j);
            else 
               string2 = string2+sArray[i].charAt(j);       
         }
         System.out.println(string1+" "+string2);
      } 
   } 
}