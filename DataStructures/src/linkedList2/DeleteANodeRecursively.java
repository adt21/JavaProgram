package linkedList2;

import java.util.Scanner;

public class DeleteANodeRecursively {
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<>(data);
			if(head == null) {
				head = currentNode ;
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
		if(temp == null) {
			return;
		}
		System.out.print(temp.data + " ");
		print(temp.next);
	}
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) { //pos = position/index
		if(head == null) {
			return head;
		}
		if(pos == 0) {
			head = head.next;
			return head;
		}else {
			while(head != null) {
				head.next = deleteNode(head.next, pos-1);
				return head;
			}
		}
		return head;
	}
		
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = deleteNode(head,2);
		print(head);
	}

}
