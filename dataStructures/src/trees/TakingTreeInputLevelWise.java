package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakingTreeInputLevelWise {
	
	public static void printTree(TreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ": ");
		
		for(int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);
		}
	}
	public static TreeNode<Integer> takingInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		
		while(! queue.isEmpty()) {
			TreeNode<Integer> front = queue.poll();
			System.out.println("Enter the no of children for: " + front.data);
			int numChild = s.nextInt();
			for(int i = 0; i < numChild; i++) {
				System.out.println("Enter the " + i + "th child for " + front.data);
				int childData = s.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(childData);
				front.children.add(childNode);
				queue.add(childNode);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = takingInput();
		printTree(root);

	}

}

