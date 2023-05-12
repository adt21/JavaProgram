package linkedList;

public class IncrementElement {
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(20);
		Node<Integer> n2 = new Node<>(40);
		Node<Integer> n3 = new Node<>(60);
		Node<Integer> n4 = new Node<>(80);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		return n1;
	}
	
	public static void printLinkedList(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void incrementLinkedList(Node<Integer> head){
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
		
	}

	public static void main(String[] args) {
		Node<Integer> head = createLinkedList();
		incrementLinkedList(head);
		printLinkedList(head);
	}

}
