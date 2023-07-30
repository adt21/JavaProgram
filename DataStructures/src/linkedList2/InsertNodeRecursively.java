package linkedList2;
import java.util.*;
public class InsertNodeRecursively {
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
	public static Node<Integer> insertNode(Node<Integer> head , int ele, int index){
		Node<Integer> newNode = new Node<>(ele);
		if(head == null  && index > 0) {
			return head;
		}
		if(index == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		}else {
			head.next = insertNode(head.next, ele, index-1);
			return head;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = insertNode(head, 20, 0);
		print(head);
	}

}
