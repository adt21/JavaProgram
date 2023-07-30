package linkedList2;

import java.util.Scanner;

public class ReverseLLIterative {
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
		System.out.print(head.data + " ");
		print(head.next);
	}
	public static Node<Integer> reverseIterate(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> prevNode = head;
		Node<Integer> currNode = prevNode.next;
		while(currNode != null) {
			Node<Integer> nextNode = currNode.next;
			currNode.next = prevNode; // here basically we do that firstly we have 2-->5-->6 where
			//2=prev node,5=curr node,6=next node , here connection will create between
			//2(-->)<--5  6, reverse connection will make between 2 & 5 also forward connection between 2 & 5 will be present which we will cut in future
			
			//update current,previous,next node gradually
			
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null; // here we just cut the forward connection between 2 & 3 which i told before
		head = prevNode; // after exiting from while loop currentNode = null that means it's previous node will be the Head of the reverse linked list
		//thats why we declare head = prev node
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = reverseIterate(head);
		print(head);

	}

}
