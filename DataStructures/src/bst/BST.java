package bst;

public class BST {
	private BstNode<Integer> root;
	private int size;
	
	/***
	 * From User perspective you don't have root inside any method which is shown in the below
	 * user just has to pass one integer value to get the result isPresent/insert/deleteData,
	 * But to do the every method you definitely need root but you can't take this inside parameter
	 * Here you have just two way to use root ---> 1) iterative 2) helper method use,where you can use root
	 * so we use here helper method
	 * 
	 */
	private static boolean isPresentHelper(BstNode<Integer> node, int x) {
		if(node == null) {
			return false;
		}
		if(node.data == x) {
			return true;
		}
		if(x < node.data) {
			//call on left side
			return isPresentHelper(node.left,x);
		}else {
			//call on right side
			return isPresentHelper(node.right,x);
		}
	}
	public boolean isPresent(int x) {
		return isPresentHelper(root,x);
	}
	
	private static BstNode<Integer> insertHelper(BstNode<Integer> node, int x){
		if(node == null) {
			BstNode<Integer> newRoot = new BstNode<>(x);
			return newRoot;
		}
		if(x >= node.data) {
			node.right = insertHelper(node.right,x);
		}else {
			node.left = insertHelper(node.left,x);
		}
		return node;
	}
	public void insert(int x) {
		root = insertHelper(root,x); // you have to update your root because your initial root was null that's why we store new root into root 
		size++;
	}
	
	private static int minimum(BstNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		
		int minLeft = minimum(root.left);
		int minRight = minimum(root.right);
		
		return Math.min(root.data, Math.min(minLeft, minRight));
	}
	
	private static BstDeleteReturn deleteDataHelper(BstNode<Integer> root , int x) {
		if(root == null) {
			return new BstDeleteReturn(null, false);
		}
		if(root.data < x) {
			BstDeleteReturn outputRight = deleteDataHelper(root.right, x);
			root.right = outputRight.root;
			outputRight.root = root;
			return outputRight;
		}
		if(root.data > x) {
			BstDeleteReturn outputLeft = deleteDataHelper(root.left, x);
			root.left = outputLeft.root;
			outputLeft.root = root;
			return outputLeft;
		}
		//if root has 0 children
		if(root.left == null && root.right == null) {
			return new BstDeleteReturn(null, true);
		}
		//if root has only left children
		if(root.left != null && root.right == null) {
			return new BstDeleteReturn(root.left, true);
		}
		// if root has only right child
		if(root.left == null && root.right != null) {
			return new BstDeleteReturn(root.right, true);
		}
		//if root has both two child		
			int rightMax = minimum(root.right); //find the right max data in the right side
			root.data = rightMax; // now set that right max value as root 
			//but still the right max value present at right side, so we need to delete it
			BstDeleteReturn outputRight = deleteDataHelper(root.right, rightMax);
			root.right = outputRight.root;
			return new BstDeleteReturn(root, true);			
		
	}
	
	public boolean deleteData(int x) {
		BstDeleteReturn output = deleteDataHelper(root,x);
		root = output.root;
		if(output.isDeleted) {
			size--;
		}
		return output.isDeleted;
	}
	
	public int size() {
		return size;
	}
	
	private static void printTreeHelper(BstNode<Integer> root) {
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
		printTreeHelper(root.left);
		printTreeHelper(root.right);
	}
	
	public void printTree() {
		printTreeHelper(root);
	}
}
