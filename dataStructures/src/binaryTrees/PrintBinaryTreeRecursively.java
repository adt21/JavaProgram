package binaryTrees;

public class PrintBinaryTreeRecursively {
	
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
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);//creating root node
		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);//creating left node
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);//creating right node
		root.left = rootLeft; //make connection between root and left child
		root.right = rootRight;//make connection between root and right child
		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);
		
		rootLeft.right = twoRight;
		rootRight.left = threeLeft;
		
		printTree(root);

	}

}
