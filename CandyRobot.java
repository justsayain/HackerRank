import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CandyRobot {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int t = in.nextInt();
      int[] c = new int[t];
      int addCandies = 0;
      int remainCandies = n;
      
      for(int c_i=0; c_i < t; c_i++){
         c[c_i] = in.nextInt();
      }
        // your code goes here
      for(int i =0; i<c.length;i++){
         if(n<5 || n>100)
            break;
         if(c[i]<=remainCandies){
            remainCandies -= c[i];
            if(remainCandies>=5 ){
                //do nothing
            }
            else{
               if(i<t-1){
                  if(c[i]>5){
                     addCandies += c[i];
                     remainCandies = n;
                  }
                  else{
                     addCandies += remainCandies;
                     remainCandies = n;
                  }
               }
            }
         }
      }
      System.out.println(addCandies);
   }
}
