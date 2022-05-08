package com.dsa.problem2;

import java.util.Scanner;

public class BinaryTreetoSkewedTree {
	
	public static class Node{  
        int data;  
        Node left;  
        Node right;  
  
        public Node(int data){  
            this.data = data;  
            this.left = null;  
            this.right = null;  
        }  
      }   
      public Node root;  
      public BinaryTreetoSkewedTree()
      {
    	  //base case
    	  root=null;
      }
      public void insert(int data) {    
          Node newNode = new Node(data);  
          if(root == null){  
              root = newNode;  
              return;  
            }  
          else {  
              Node current = root, parent = null;  
           // Condition to check if the root Node
              // of the skewed tree is not defined
              while(true) {  
                  parent = current;
                  if(data < current.data) {  
                      current = current.left;  
                      if(current == null) {  
                          parent.left = newNode;  
                          return;  
                      }  
                  }   
                  else {  
                      current = current.right;  
                      if(current == null) {  
                          parent.right = newNode;  
                          return;  
                      }  
                  }  
              }  
          }  
      }  
      //Inorder Traversal of tree
      public void inOrderTraversal(Node root)
      {
    	  if(root==null)
    	  {
    		  System.out.println("Tree is empty");
    		  return;
    	  }
    	  else
    	  {
    		  if(root.left!=null)
    			  inOrderTraversal(root.left);
    		  System.out.println(root.data);
    		  if(root.right!=null)
    			  inOrderTraversal(root.right);
    			  
    	  }
      }
   // Driver Code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an object for class
		BinaryTreetoSkewedTree BTST = new BinaryTreetoSkewedTree();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of values to insert into BST :");
		int N = sc.nextInt();
		System.out.println("Enter the values:");
		for(int i=0;i<N;i++)
		{
			BTST.insert( sc.nextInt());
		}
		System.out.println("Binary search tree after insertion:");  
		BTST.inOrderTraversal(BTST.root);
		sc.close();
	
	}

}
