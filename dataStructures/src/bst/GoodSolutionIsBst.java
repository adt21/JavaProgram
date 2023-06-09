package bst;

import java.util.Scanner;

public class GoodSolutionIsBst {
	
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
	
	public static boolean isBst(BstNode<Integer> root) {
		return isBstHelper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	public static boolean isBstHelper(BstNode<Integer> root, int minRange, int maxRange) {
		if(root == null) {
			return true;
		}
		if(root.data > minRange && root.data <= maxRange) {
			boolean isLeftBst = isBstHelper(root.left, minRange, root.data-1);
			boolean isRightBst = isBstHelper(root.right, root.data, maxRange);
			return isLeftBst && isRightBst;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		BstNode<Integer> root = takingInput(true, 0, true);
		print(root);
		System.out.println("Is this a Binary Search Tree? " + isBst(root));
	}

}
