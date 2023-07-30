package linkedList;

public class LinkedListUse {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1; // n1 is reference
		n1 = new Node<>(10); //when you write this then new node is created actually where data value is 10
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next = n2;
//		System.out.println("n1 " + n1 + " data " + n1.data + " next " + n1.next);
		n2.next = n3;
//		System.out.println("n2 " + n2 + " data " + n2.data + " next " + n3.next);
		n3.next = n4;
//		System.out.println("n3 " + n3 + " data " + n3.data + " next " + n3.next);
//		System.out.println("n4 " + n4 + " data " + n4.data + " next " + n4.next);
		return n1;
	}
	
	public static void print(Node<Integer> head) {
		//****Below This is a lengthy way to print linked list***
		
		
		System.out.println("print " +head);//address of 1st node
		System.out.println(head.data);//data of 1st node
		System.out.println(head.next); // address of 2nd node as n1(head) .next = n2(reference/address of 2nd node)
		System.out.println(head.next.data); // data of 2nd node
		System.out.println(head.next.next);//address of 3rd node
		System.out.println(head.next.next.data);//data of 3rd node
		System.out.println(head.next.next.next);//address of 4th node
		System.out.println(head.next.next.next.data);//data of 4th node
	
	}

	public static void main(String[] args) {
		
		Node<Integer> head = createLinkedList();
//		System.out.println("Main " + head);
		print(head);
//		Node<Integer> n1 = new Node<>(10);
//		System.out.println(n1);
//		System.out.println(n1.data);
//		System.out.println(n1.next);

	}

}
