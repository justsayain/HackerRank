import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> names = new ArrayList<>();
        String mailPattern = "[a-z]+@gmail.com";
        Pattern mp = Pattern.compile(mailPattern);
        
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            
            Matcher match = mp.matcher(emailID);
            if(match.find()){
                names.add(firstName);
            }
        }
        // sorting
        Collections.sort(names);
        for (String name: names)
            System.out.println(name);
    }
}
