import java.io.*;
import java.util.*;

// A level-order traversal, also known as a breadth-first search, 
// visits each level of a tree's nodes from left to right, top to bottom. 
// You are given a pointer, root, pointing to the root of a binary search tree. 
// Complete the levelOrder function provided in your editor so that it prints the 
// level-order traversal of the binary search tree.

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Day23{
    	static void levelOrder(Node root){
      //Write your code here
        Queue<Node> bstq = new LinkedList<Node>();
        if(root != null){
            bstq.offer(root);
            while(!bstq.isEmpty()){
                Node current = bstq.poll();
                System.out.print(current.data + " ");
                if(current.left != null)
                    bstq.offer(current.left);
                if(current.right != null)
                    bstq.offer(current.right);
                
            }
        }
    }
    	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}