package trees;

public class PrintTreeRecursive {
	
	public static void printTree(TreeNode<Integer> root) {
		//print the tree in Preorder way
		
		if(root == null) { //this is not a base case , this is the special case
			return;
		}
		/*
		 * Here no base case is present explicitly, rather than present implicitly,, if there is no child then
		 * the for loop will not run for the node this is kind of base case
		 */
		System.out.print(root.data + ": "); // 4, 2, 3, 5, 6, 1
		
		for(int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data + " "); // (2,3,1) (5, 6)
		}
		
		System.out.println();
		
		for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);
		}
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<Integer>(4); 		
		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
		TreeNode<Integer> node3 = new TreeNode<Integer>(1);		
		TreeNode<Integer> node4 = new TreeNode<Integer>(5);
		TreeNode<Integer> node5 = new TreeNode<Integer>(6);
		
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);		
		node2.children.add(node4);
		node2.children.add(node5);
		
		printTree(root);

	}

}
