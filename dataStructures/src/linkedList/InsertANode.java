package linkedList;

import java.util.Scanner;

public class InsertANode {
	
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
	
	public static void insertNode(Node<Integer> head, int element, int index){
		Node<Integer> nodeToBeInserted = new Node<>(element);
		if(index == 0) {
			nodeToBeInserted.next = head;//value of head node is stored in next node(index 1) of new node(0th index) as new node is head now at 0th index
			head = nodeToBeInserted;
		}else {
			int count = 0;
			Node<Integer> temp = head;
			while(temp != null && count < index -1) { // count < index-1 it simply means traverse the linked list from head to previous node of new node which is to be inserted
				count++;
				temp = temp.next;
			}if(temp != null) {
				nodeToBeInserted.next = temp.next;// value of temp.next(index 3) will be stored at index 4 as new node will be be stored at index 3
				temp.next = nodeToBeInserted; //here new node is stored at index 3(temp.next = 2.next = index 3)
			}
		}
		
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		insertNode(head, 20, 3);
		print(head);
	}

}
