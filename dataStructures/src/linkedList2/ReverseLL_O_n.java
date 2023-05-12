package linkedList2;
//this is the best way to do recursion whereas time complexity = O(n)
import java.util.Scanner;
//Assume linked list = 2-->3-->4-->5
public class ReverseLL_O_n {
	
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
	
	public static void printLL(Node<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printLL(head.next);
	}
	public static Node<Integer> reverseLL(Node<Integer> head){
		if(head == null || head.next == null) { //base case of the recursion 
			return head;
		}
		Node<Integer> smallHead = reverseLL(head.next); // 5-->4-->3(smallHead = 5 and smallTail = 3)
		//up to this linked list look like 5-->4-->3<--2,here we need to reverse connection between 2 & 3 and 2.next will be null as 2 is the tail of the reverse linked list
		Node<Integer> smallTail = head.next; // main head=2 (of original linked list) so 2.next = 3(smallTail)
		smallTail.next = head;//reverse connection between 2 & 3
		head.next = null; //in reverse linked list 2 connect with null as 2 is tail now
		return smallHead;
		
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = reverseLL(head);
		printLL(head);

	}

}
