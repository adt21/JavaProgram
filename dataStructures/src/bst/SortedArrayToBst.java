package bst;

public class SortedArrayToBst {
	public static BstNode<Integer> sortedArrayToBst(int[] arr,int n){
		return sortedArrayToBstHelper(arr,0,n-1);
	}
	
	public static BstNode<Integer> sortedArrayToBstHelper(int[] arr, int start, int end){
		if(start > end) {
			return null;
		}
		int midIndex = start + (end - start)/2;
		BstNode<Integer> root = new BstNode<>(arr[midIndex]);
		root.left = sortedArrayToBstHelper(arr,start,midIndex-1);
		root.right = sortedArrayToBstHelper(arr,midIndex+1,end);
		return root;		
	}
	public static void printTree(BstNode<Integer> root) {
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
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int n = 5;
		BstNode<Integer> root = sortedArrayToBst(arr,n);
		printTree(root);

	}

}
