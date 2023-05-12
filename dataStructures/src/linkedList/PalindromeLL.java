package linkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeLL {
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<>(data);
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}else {
				tail.next = currentNode;
				tail = currentNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static boolean isPalindrome(Node<Integer> head) {
		Node<Integer> temp = head;
		ArrayList<Integer> arr = new ArrayList<>();
		while(temp != null) {
			arr.add(temp.data);
			temp = temp.next;
		}
		int start = 0, end = arr.size() - 1;
		while(start < end) {
			if(arr.get(start) != arr.get(end)) {
				return false;
			}else {
				start++;
				end--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
		System.out.println(isPalindrome(head));

	}

}
