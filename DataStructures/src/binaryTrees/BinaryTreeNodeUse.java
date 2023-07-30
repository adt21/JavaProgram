package binaryTrees;

public class BinaryTreeNodeUse {

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
		
	}

}
