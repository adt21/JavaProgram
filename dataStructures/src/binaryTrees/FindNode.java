package binaryTrees;

import java.util.Scanner;

public class FindNode {
	
	public static BinaryTreeNode<Integer> takingInput(boolean isRoot,int parentData,boolean isLeft){
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
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> rootLeft = takingInput(false,rootData,true);
		BinaryTreeNode<Integer> rootRight = takingInput(false,rootData,false);
	    root.left = rootLeft;
	    root.right = rootRight;
	    return root;
	}
	
	public static void print(BinaryTreeNode<Integer> root) {
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
	
	public static boolean IsNodeExist(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return false;
		}
		if(root.data == x) {
			return true;
		}
		boolean leftExist = IsNodeExist(root.left,x);
		boolean rightExist = IsNodeExist(root.right,x);
		return leftExist || rightExist;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takingInput(true, 0, true);
		print(root);
		System.out.println("Enter the value of x");
		int x = s.nextInt();
		System.out.println("Is the given data node present in tree? " + IsNodeExist(root,x));
				
	}

}
