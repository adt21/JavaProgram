package linkedList;

//this is a better way to print a linkedList
public class PrintEntireLinkedList {
	public static Node<Integer> createLinkedlist(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
		
	}
	public static void print(Node<Integer> head) {
		// In LinkedList you have to care about the address of 1st node(head) that's why you have to store head value in temp variable
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node<Integer> head = createLinkedlist();
		print(head);
	}

}
