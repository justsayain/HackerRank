import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. 
// Given a number, n, determine and print whether it's prime or not prime.

public class Day25 {
    public static boolean prime(int number){
        boolean prime = true;
        if (number == 1)
            prime= false;
        else
            if (number == 2)
               prime= true;
            else
               if (number % 2 == 0)
                   prime= false;
            else{
              for (int d = 3; d <= (int) Math.sqrt(number); d = d+2) 
                if (number % d == 0)
                  prime= false;
          }
        return prime;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int array[] = new int[a];
        for(int i = 0; i < a; i++){
            array[i] = input.nextInt();
        }
        for(int i = 0;i < array.length;i++){
            if(prime(array[i]))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
           
   
    }
}
