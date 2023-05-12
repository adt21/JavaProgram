package binaryTrees;

import java.util.Scanner;

public class TakingInput {
	
	public static BinaryTreeNode<Integer> takeInput(boolean isRoot,int parentData,boolean isLeft){
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
		BinaryTreeNode<Integer> leftChild = takeInput(false,rootData,true);
		BinaryTreeNode<Integer> rightChild = takeInput(false,rootData,false);
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ",");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		printTree(root.left);
		printTree(root.right);
		
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput(true,0,true);//here mainly root does matter that's why we write it 1st as true(inside takingInput function argument) and then parentData(0) and isLeft(true) does not matter
		printTree(root);
	}

}
