package linkedList2;

import java.util.Scanner;

public class RecursivePrint {
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
		if(head == null) {
			return;
		}
//		print(head.next);//here we write this when we want to print reverse order linked list
		System.out.print(head.data + " ");
		print(head.next);
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
	}

}
