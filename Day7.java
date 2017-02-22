import java.io.*;
import java.util.*;

//Given an array, A , of n integers, print A's 
//elements in reverse order as a single line of space-separated numbers.
public class Day7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] A = new int[n];
        for(int i=0; i < n; i++){
            A[i] = input.nextInt();
        }
        input.close();
        for(int j = n-1; j >= 0; j--){
            System.out.print(A[j] + " ");
        }
    }
}
