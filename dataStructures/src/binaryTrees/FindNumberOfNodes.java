package binaryTrees;
//time complexity of this code is O(n)
import java.util.Scanner;

public class FindNumberOfNodes {
	
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
		System.out.println(root.data);
		if(root.left != null) {
			System.out.println("L" + root.left.data + ",");
		}
		if(root.right != null) {
			System.out.println("R" + root.right.data);
		}
		System.out.println();
		print(root.left);
		print(root.right);
	}
	
	public static int numberOfNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftNodeCount = numberOfNodes(root.left);
		int rightNodeCount = numberOfNodes(root.right);
		
		return 1 + leftNodeCount + rightNodeCount;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takingInput(true,0,true);
		print(root);
		System.out.println("Number of nodes : " + numberOfNodes(root));
	}

}
