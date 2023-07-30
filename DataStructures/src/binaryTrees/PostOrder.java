package binaryTrees;

import java.util.Scanner;

public class PostOrder {
	
	public static BinaryTreeNode<Integer> takingInput(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left Child of " + parentData);
			}else {
				System.out.println("Enter right Child of " + parentData);
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
	public static void printPostOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
//		if(root.left != null) {
//			System.out.print("L" + root.left.data + ",");
//		}
//		if(root.right != null) {
//			System.out.print("R" + root.right.data + ": ");
//		}
//		System.out.println();
		
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takingInput(true, 0, true);
		printPostOrder(root);

	}

}
