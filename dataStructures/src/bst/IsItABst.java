package bst;

import java.util.Scanner;
//time complexity is O(n)
public class IsItABst {
	
	public static BstNode<Integer> takingInput(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data");
		}else {
			if(isLeft) {
				System.out.println("Enter left child of " + parentData);
			}else {
				System.out.println("Enter right child of " + parentData);
			}
		}
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BstNode<Integer> root = new BstNode<Integer>(rootData);
		BstNode<Integer> rootLeft = takingInput(false,rootData,true);
	    BstNode<Integer> rootRight = takingInput(false,rootData,false);
	    root.left = rootLeft;
	    root.right = rootRight;
	    return root;
	}
	
	public static void print(BstNode<Integer> root) {
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
		print(root.left);
		print(root.right);
	}
	
	public static IsBstReturn isBst(BstNode<Integer> root) {
		if(root == null) {
			IsBstReturn ans = new IsBstReturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true); //if there is null tree then minimum value is (+ infinitive) and max value (- infinitive)
			return ans;
		}
		
		IsBstReturn leftAns = isBst(root.left); // from left side we will get max,min,isBst
		IsBstReturn rightAns = isBst(root.right);// from right side we will get max,min,isBst
		
		int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
		int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
		
		boolean isBst1 = true; // we assume that it is true
		if(leftAns.max >= root.data) {
			isBst1 = false;
		}
		if(rightAns.min < root.data) {
			isBst1 = false;
		}
		if(! leftAns.isBst) {
			isBst1 = false;
		}
		if(! rightAns.isBst) {
			isBst1 = false;
		}
		IsBstReturn ans = new IsBstReturn(min, max, isBst1);
		return ans;
	}

	public static void main(String[] args) {
		BstNode<Integer> root = takingInput(true,0,true);
		print(root);
		IsBstReturn ans = isBst(root);
		System.out.println(ans.min + " " + ans.max + " " + ans.isBst);
	}

}
