package linkedList;

public class CreateLinkedListAndMakeConnection {
	public static Node<Integer> createLinkedList(){
		//Create Linked List
		
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		
		// Make connection between each node
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		return n1;
	}

	public static void main(String[] args) {
		Node<Integer> head = createLinkedList();
		System.out.println(head); // will be print reference of the 1st node
	}

}
