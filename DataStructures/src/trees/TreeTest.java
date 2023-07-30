package trees;

public class TreeTest {

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<Integer>(4); //creating root node with data 4
		// root node has 3 children(1,2,3)
		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
		TreeNode<Integer> node3 = new TreeNode<Integer>(1);
		//node2 has two children (4 & 5)
		TreeNode<Integer> node4 = new TreeNode<Integer>(5);
		TreeNode<Integer> node5 = new TreeNode<Integer>(6);
		//add the reference of the children node to root node via ArrayList
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		// add the reference of the node4 and node5 to their parent node (node2) via ArrayList
		node2.children.add(node4);
		node2.children.add(node5);

	}

}
