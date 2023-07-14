package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SumOfAllNodes {
	
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
			System.out.println("Enter the number of child of: " + front.data);
			int numChild = s.nextInt();
			
			for(int i = 0; i < numChild; i++) {
				System.out.println("Enter the " + i + "th child of " + front.data);
				int child = s.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				front.children.add(childNode);
				queue.add(childNode);
			}
		}
		return root;
		
	}
	
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
	
	public static int sumOofAllNodes(TreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int sum = 0; 
		for(int i = 0; i < root.children.size(); i++) {
			int child = sumOofAllNodes(root.children.get(i)); 
			sum = sum + child;
		}
		return root.data + sum;
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = takingInput();
		printTree(root);
		System.out.println("Sum of all the nodes is: " + sumOofAllNodes(root));
	}

}
