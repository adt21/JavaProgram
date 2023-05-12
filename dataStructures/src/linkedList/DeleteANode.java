package linkedList;

import java.util.Scanner;

public class DeleteANode {
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static Node<Integer> takeInput(){
		Scanner s =  new Scanner(System.in);
		int data = s.nextInt();
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
			data = s.nextInt();
		}
		return head;
	}
	
	public static void deleteNode(Node<Integer> head, int index) {
		if(head == null) {
			return;
		}
		if(index == 0) {
			head = head.next; // head.next(at index 1) value will be head node value
		}else {
			Node<Integer> temp = head;
			int count = 0;
			while(temp != null && count < index-1) {
				count++;
				temp = temp.next;
			}if(temp.next != null) {
				temp.next = temp.next.next;
			}
		}
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		deleteNode(head, 2);
		print(head);
	}

}
