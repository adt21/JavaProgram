package bst;

import java.util.Scanner;

public class ElementsBetweenK21AndK2 {
	
	public static BstNode<Integer> takingInput(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of " + parentData);
			}else {
				System.out.println("Enter right child of " + parentData);
			}
		}
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BstNode<Integer> root = new BstNode<Integer>(rootData);
		BstNode<Integer> rootLeft = takingInput(false,rootData,true);
	    BstNode<Integer> rootRight = takingInput(false,rootData,false);
	    root.left = rootLeft;
	    root.right = rootRight;
	    return root;
	}
	
	public static void print(BstNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		print(root.left);
		print(root.right);
	}
	
	public static void printBetweenK1K2(BstNode<Integer> root, int k1, int k2) {
		if(root == null) { // base case
			return;
		}
		if(root.data < k1) {
			printBetweenK1K2(root.right,k1,k2);
		}else if(root.data > k2) {
			printBetweenK1K2(root.left,k1,k2);
		}else {
			System.out.print(root.data + " ");
			printBetweenK1K2(root.left,k1,k2);
			printBetweenK1K2(root.right,k1,k2);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BstNode<Integer> root = takingInput(true,0,true);
		System.out.println("Enter the value of k1");
		int k1 = s.nextInt();
		System.out.println("Enter the value of k2");
		int k2 = s.nextInt();
		print(root);
		System.out.println("The elements inbetween k1 and k2 :");
		printBetweenK1K2(root,k1,k2);
		
	}

}
