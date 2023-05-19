package binaryTrees;

public class TreeUsingInorderAndPreorder {
	
	private static BinaryTreeNode<Integer> buildTreeHelper(int[] inorder, int[] preorder, int inS, int inE, int preS, int preE) { // inS = inorder starting index and inE = end index for inorder similarly for preorder(preS & preE)
		
		if(inS > inE || preS > preE) {
			return null;
		}
		int rootData = preorder[preS];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		int rootInIndex = -1;
		for(int i = inS; i <= inE; i++) {
			if(inorder[i] == rootData) {
				rootInIndex = i;
				break;
			}
		}
		if(rootInIndex == -1) {
			return null;
		}
		int leftInS = inS;  //left inorder starting index
		int leftInE = rootInIndex - 1;  //left inorder ending index
		int leftPreS = preS + 1;  //left preorder starting index
		int leftPreE = leftInE - leftInS + leftPreS;  //left preorder starting index
		int rightInS = rootInIndex + 1;  //right inorder starting index
		int rightInE = inE;  //right inorder starting index
		int rightPreS = leftPreE + 1;  //right preorder starting index
		int rightPreE = preE;  //right preorder starting index
		
		root.left = buildTreeHelper(inorder,preorder,leftInS,leftInE,leftPreS,leftPreE);
		root.right = buildTreeHelper(inorder, preorder, rightInS, rightInE, rightPreS, rightPreE);
		return root;
	}
	
	public static BinaryTreeNode<Integer> buildTree(int[] inorder,int preorder[]){
		
		return buildTreeHelper(inorder,preorder,0,inorder.length - 1, 0, preorder.length - 1);
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ": ");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ", ");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		printTree(root.left);
		printTree(root.right);
	}
	
	public static void main(String[] args) {
		int inorder[] = {4,2,5,1,3,7};
		int preorder[] = {1,2,4,5,3,7};
		BinaryTreeNode<Integer> root = buildTree(inorder,preorder);
		printTree(root);
	}

}
