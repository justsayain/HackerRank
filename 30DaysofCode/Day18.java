import java.io.*;
import java.util.*;

public class Day18 {
   // Write your code here.
   static Stack<Character> S;
   static Queue<Character> Q;
   
   Day18(){
      S = new Stack<Character>();
      Q = new LinkedList<Character>();
   }
   static void pushCharacter(char ch){
      S.push(ch);
   }
   
   static char popCharacter(){
      return S.pop();
   }
   
   static void enqueueCharacter(char ch){
      Q.add(ch);
   }
   
   static char dequeueCharacter(){
      return Q.remove();
   }
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine();
      scan.close();
   
      // Convert input String to an array of characters:
      char[] s = input.toCharArray();
   
      // Create a Day18 object:
      Day18 p = new Day18();
   
      // Enqueue/Push all chars to their respective data structures:
      for (char c : s) {
         p.pushCharacter(c);
         p.enqueueCharacter(c);
      }
   
      // Pop/Dequeue the chars at the head of both data structures and compare them:
      boolean isPalindrome = true;
      for (int i = 0; i < s.length/2; i++) {
         if (p.popCharacter() != p.dequeueCharacter()) {
            isPalindrome = false;                
            break;
         }
      }
   
      //Finally, print whether string s is palindrome or not.
      System.out.println( "The word, " + input + ", is " 
                        + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
   }
}