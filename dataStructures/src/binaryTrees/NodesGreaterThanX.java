package binaryTrees;

import java.util.Scanner;

public class NodesGreaterThanX {
	public static BinaryTreeNode<Integer> takingInput(boolean isRoot,int parentData, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data");
		}
		else {
			if(isLeft) {
				System.out.println("Enter left child of: " + parentData);
			}else {
				System.out.println("Enter right child of: " + parentData);
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
		System.out.print(root.data + ": ");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ",");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		print(root.left);
		print(root.right);
	}
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return 0;
		}
		int count = (root.data > x) ? 1 : 0;//Ternary Operator
		if(root.left != null) {
			count += countNodesGreaterThanX(root.left,x);
		}
		if(root.right != null) {
			count += countNodesGreaterThanX(root.right,x);
		}
		return count;
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takingInput(true, 0, true);
		print(root);
		System.out.println(countNodesGreaterThanX(root,7));

	}

}
