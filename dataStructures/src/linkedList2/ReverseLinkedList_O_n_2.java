package linkedList2;
//reverse a linked list in recursive way whereas time complexity = O(n^2)
import java.util.Scanner;
//Assume linked list = 2-->3-->4-->5-->null
public class ReverseLinkedList_O_n_2 {
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
	public static Node<Integer> reverseLL(Node<Integer> head) {
		if(head == null || head.next == null) { //head.next = null means if there is a single data then no need to reverse
			return head;
		}
		Node<Integer> smallHead = reverseLL(head.next);// 5-->4-->3-->null(reverse) after recursion
		//now small head = 5 after recursion
		Node<Integer> tail = smallHead;
		while(tail.next != null) {
			tail = tail.next; // traverse the small linked list(5 4 3) to reach the tail(3) of the linked list
		}
		//till this linked list look like 5-->4-->3<--2 , here we need to reverse connection between 2 & 3
		//that's why we need to connect 3 to 2 and 2 to null
		tail.next = head;
		head.next = null;
		return smallHead;
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = reverseLL(head);
		print(head);

	}

}
