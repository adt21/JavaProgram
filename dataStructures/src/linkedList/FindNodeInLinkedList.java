package linkedList;

import java.util.Scanner;

public class FindNodeInLinkedList {
	
	public static Node<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null, tail = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}else {
				tail.next = currentNode;
				tail = currentNode;
		    }
			data = sc.nextInt();
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
	
	public static int findNode(Node<Integer> head, int n) {
		Node<Integer> temp = head;
		int count = 0;
		while(temp != null) {
			if(temp.data == n) {
				return count;
		}else {
			temp = temp.next;
			count++;
		  }
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Node<Integer> head = takeInput();
		print(head);
		int n = s.nextInt();
		System.out.print(findNode(head,n));
	}

}
