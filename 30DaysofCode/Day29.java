import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day29 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int max =0;
            int n = in.nextInt();
            int k = in.nextInt();
            for(int i = 1; i<n ;i++){
                for(int j=i+1;j<=n;j++){
                    int opVal = i&j;
                    if(opVal > max && opVal < k ){
                        max = opVal;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
