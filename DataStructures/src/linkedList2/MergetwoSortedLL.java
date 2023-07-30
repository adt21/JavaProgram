package linkedList2;

import java.util.Scanner;

public class MergetwoSortedLL {
	
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
	
	public static Node<Integer> mergeLL(Node<Integer> head1, Node<Integer> head2){
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		Node<Integer> t1 = head1;
		Node<Integer> t2 = head2;
		Node<Integer> head = null, tail = null; //here we declare new marge ll's head and tail
		
		// head selection for new sorted linked list among two sorte linked list
		if(t1.data <= t2.data) {
			head = t1;
			tail = t1;
			t1 = t1.next;//t1 upgrade to next node 
		}else {
			head = t2;
			tail = t2;
			t2 = t2.next;
		}
		
		// compare all the nodes of the both linked list,,so needed loop
		while(t1 != null && t2 != null) {
			if(t1.data <= t2.data) {
				tail.next = t1;
				tail = t1;
				t1 = t1.next;
			}else {
				tail.next = t2;
				tail = t2;
				t2 = t2.next;
			}
		}
		
		//if one list is completed,but another linked list element still remaining
		if(t1 != null) { //remaining element of linked list 1
			tail.next = t1;
		}else { //remaining element of linked list 2
			tail.next = t2;
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		print(head.next);
	}

	public static void main(String[] args) {
		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		Node<Integer> head = mergeLL(head1, head2);
		print(head);
	}

}
