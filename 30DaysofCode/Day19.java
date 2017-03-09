import java.io.*;
import java.util.*;

// The AdvancedArithmetic interface and the method declaration for
// the abstract int divisorSum(int n) method are provided for you in the editor below. 
// Write the Calculator class, which implements the AdvancedArithmetic interface. 
// The implementation for the divisorSum method must be public and take an integer parameter, n,
// and return the sum of all its divisors.

interface AdvancedArithmetic{
   int divisorSum(int n);
}
//Write your code here
class Calculator implements AdvancedArithmetic{
   private static int n;
   public int divisorSum(int n){
      int sum = 0;
      for(int i = 1; i <= n; i++){
         if(n % i == 0){
            sum += i;
         }
      }
      return sum;
   }

}
class Day19 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      scan.close();
      
      AdvancedArithmetic myCalculator = new Calculator(); 
      int sum = myCalculator.divisorSum(n);
      System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
      System.out.println(sum);
   }
}