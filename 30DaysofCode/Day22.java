import java.util.*;
import java.io.*;

// The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. 
// You are given a pointer, root, pointing to the root of a binary search tree. 
// Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Day22{
    
    	public static int getHeight(Node root){
      //Write your code here
        int result = 0, lCount =0, rCount = 0;
        if(root == null){
            return result = 0;
        }else{
            if(root.right != null)
                rCount += getHeight(root.right)+1;
            if(root.left != null)
                lCount += getHeight(root.left)+1;
            if(lCount < rCount)
                 result = rCount;
               else
                 result = lCount;
            }
        
        return result;
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
            int height=getHeight(root);
            System.out.println(height);
        }	
}