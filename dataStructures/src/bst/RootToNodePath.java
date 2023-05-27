package bst;

import java.util.ArrayList;
import java.util.Scanner;

public class RootToNodePath {
	
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
	
	public static ArrayList<Integer> rootToNodePath(BstNode<Integer> root,int x){
		if(root == null) {
			return null;
		}
		if(root.data == x) {
			ArrayList<Integer> ans = new ArrayList<>();
			ans.add(root.data);//you can also write x inside ans.add() because x and root.data is same here
			return ans;
		}
		ArrayList<Integer> leftOutput = rootToNodePath(root.left,x);
		if(leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer> rightOutput = rootToNodePath(root.right,x);
		if(rightOutput != null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BstNode<Integer> root = takingInput(true, 0, true);
		print(root);
		System.out.println("Enter value of x: ");
		int x = s.nextInt();
		ArrayList<Integer> path = rootToNodePath(root,x);
		if(path == null) {
			System.out.println("Not Found");
		}else {
			for(int i : path) { // for each loop
				System.out.print(i + " ");
			}
		}
		

	}

}
