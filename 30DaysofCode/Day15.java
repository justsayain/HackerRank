import java.io.*;
import java.util.*;

// The following input is handled for you by the locked code in the editor: 
// The first line contains T, the number of test cases. 
// The T subsequent lines of test cases each contain an integer to be inserted at the list's tail.

class Node {
   int data;
   Node next;
   Node(int d) {
      data = d;
      next = null;
   }
}

class Day15 {
   public static  Node insert(Node head,int data) {
        //Complete this method
      if( head == null){
         head = new Node(data);
      }
      else{
         Node n = insert(head.next, data);
         head.next = n;
      }
      return head;
        
   }
   public static void display(Node head) {
      Node start = head;
      while(start != null) {
         System.out.print(start.data + " ");
         start = start.next;
      }
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      Node head = null;
      int N = sc.nextInt();
   
      while(N-- > 0) {
         int ele = sc.nextInt();
         head = insert(head,ele);
      }
      display(head);
      sc.close();
   }
}