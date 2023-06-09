package bst;

/***
 * This method for checking is B s t or not is very time consuming. I mean it has worst time complexity
 * so if you want to see this primary effort , then you can see it.
 * But good time complexity code for this is available in these classes --> IsBstReturn,IsItABst
 * Also you can check GoodSolutionIsBst class for good solution
 */


import java.util.Scanner;

public class IsBst {
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
	
	private static int minimum(BstNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int leftmin = minimum(root.left);
		int rightmin = minimum(root.right);
		return Math.min(root.data, Math.min(leftmin, rightmin));
	}

	private static int maximum(BstNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int leftmin = maximum(root.left);
		int rightmin = maximum(root.right);
		return Math.max(root.data, Math.max(leftmin, rightmin));
	}
	
	public static boolean isBst(BstNode<Integer> root) {
		if(root == null) {
			return true;
		}
		int leftMax = maximum(root.left); // as we already know that in bst root is larger than left side that's we need to find root's subtree's max value which should be less than root
		
		if(leftMax >= root.data) {
			return false;
		}
		int rightMin = minimum(root.right);
		if(rightMin < root.data) {
			return false;
		}
		boolean isLeftBst = isBst(root.left);
		boolean isRightBst = isBst(root.right);
		return isLeftBst && isRightBst;
		
	}
	public static void main(String[] args) {
		BstNode<Integer> root = takingInput(true, 0, true);
		print(root);
		boolean ans = isBst(root);
		System.out.println("This is a Binary Search Tree ? " + ans);
	}

}
