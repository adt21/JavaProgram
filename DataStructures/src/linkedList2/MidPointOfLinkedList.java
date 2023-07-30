package linkedList2;

import java.util.Scanner;

//****one point that you can't use it to calculate length of the linked list
public class MidPointOfLinkedList {
	
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
	
	public static Node<Integer> midPointLL(Node<Integer> head){
		Node<Integer> fast = head, slow = head;
		while(fast.next != null && fast.next.next != null) { //two condition ,1st one is for odd LL and Second one is for even LL
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		Node<Integer> mid = midPointLL(head);
		System.out.println(mid.data);

	}

}
