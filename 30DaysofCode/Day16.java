import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Read a string, S, and print its integer value; if S cannot be converted to an integer, print Bad String.

public class Day16 {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String S = in.next();
      try{
         
         System.out.println(Integer.parseInt(S));
      }
      catch(NumberFormatException e){
         System.out.print("Bad String");
      }
   }
}