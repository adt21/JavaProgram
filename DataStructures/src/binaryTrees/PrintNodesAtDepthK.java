package binaryTrees;
//time complexity of this code = O(n)
import java.util.Scanner;

public class PrintNodesAtDepthK {
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
	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return;
		}
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		printAtDepthK(root.left,k-1);
		printAtDepthK(root.right,k-1);
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takingInput(true, 0, true);
		print(root);
		System.out.println("Elements at depth k");
		printAtDepthK(root,2);
	}

}
