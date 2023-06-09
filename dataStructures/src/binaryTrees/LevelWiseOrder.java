package binaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelWiseOrder {
	
	public static BinaryTreeNode<Integer> levelWiseTakeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		//now a create a queue as level wise take input specifies FIFO manner
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>(); //here inside type of queue we insert a node because we have to connect it with it's left child as well as it's right child but if we enter integer data only then we can't create connection between root and it's left child	}
		
		/***
		 * now we need to insert root data into queue then it's left / right child as well
		 */
		pendingChildren.add(root);//add root into queue
		
		//do this until unless queue is not null and first you have to remove your front of queue
		
		while(! pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildren.poll();
			System.out.println("Enter the left child of: " + front.data);
			int left = s.nextInt();
			if(left != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				//now attach right child to root data
				front.left = leftChild;
				pendingChildren.add(leftChild);
			}
			System.out.println("Enter the right child of: " + front.data);
			int right = s.nextInt();
			if(right != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				//now attach right child to root data
				front.right = rightChild;
				pendingChildren.add(rightChild);
			}
		}
		return root;
	
	}
	
	public static void print(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ": ");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		print(root.left);
		print(root.right);
	}
	
	public static void printLevelwise(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);//queue.add(root.data);
		 while(!queue.isEmpty())
	        {
	            BinaryTreeNode<Integer> front = queue.poll();
	            System.out.print(front.data+":");
	            if (front.left!=null)
	            {
	            	queue.add(front.left);
	                System.out.print("L:"+front.left.data);
	            }
	            else
	            {
	                System.out.print("L:-1");
	            }
	            
	            if (front.right!=null)
	            {
	                queue.add(front.right);
	                System.out.print(",R:"+front.right.data);
	            }
	            else
	            {
	                System.out.print(",R:-1");
	            }
	            System.out.println();
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = levelWiseTakeInput();
		printLevelwise(root);
	}

}
