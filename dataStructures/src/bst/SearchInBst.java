package bst;

import java.util.*;

public class SearchInBst {
	public static BstNode<Integer> takingInput(boolean isRoot, int parentData, boolean isLeft ){
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
	
	public static void printBst(BstNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		printBst(root.left);
		printBst(root.right);
	}
	public static boolean isPresentInBst(BstNode<Integer> root, int data) {
		if(root == null) { // base case
			return false;
		}		
		int rootData = root.data;
		if(rootData == data) {
			return true;
		}
		if(data < rootData) {
			return isPresentInBst(root.left,data);
		}
		return isPresentInBst(root.right,data);
				
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BstNode<Integer> root = takingInput(true,0,true);
		System.out.println("Enter value of K");
		int k = s.nextInt();
		printBst(root);
		System.out.println(isPresentInBst(root,k));
	}

}
