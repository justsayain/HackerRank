import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day26 {

   public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
      int dayReturned = sc.nextInt();
      int monthReturned = sc.nextInt();
      int yearReturned = sc.nextInt();
      
      int dayDue = sc.nextInt();
      int monthDue = sc.nextInt();
      int yearDue = sc.nextInt();
      
      if(yearReturned<=yearDue){
         if(yearReturned==yearDue){
            int months = monthReturned - monthDue;
            if(months<=0){
               if(monthReturned==monthDue){
                  int days = dayReturned - dayDue;
                  if(days>0){
                     System.out.println(days*15);
                  }
                  else 
                     System.out.println(0);
               } 
               else 
                  System.out.println(0);
            } 
            else 
               System.out.println(500*months); 
         } 
         else 
            System.out.println(0);
      } 
      else 
         System.out.println(10000);
   }
}