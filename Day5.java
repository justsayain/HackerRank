import java.util.*;
//Given an integer, n , print its first 10 multiples.
//Each multiple should be printed on a new line 
//in the form: n x i = result.

public class Day5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <=10; i++){
            System.out.println(n + " x " + i + " = " + (i*n));
        }
    }
}
