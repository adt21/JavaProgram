package linkedList;

import java.util.Scanner;

public class TakingInputFromUser {
	
	public static void printLinkedList(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static Node<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null, tail = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				//Make the first node as head
				head = currentNode;
				tail = currentNode;
			}else {
				tail.next = currentNode; // current node will be stored at tail.next position
				tail = currentNode;// now tail = current node
		    }
			data = sc.nextInt();
	   }
		return head;
	}
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		printLinkedList(head);
	}

}
