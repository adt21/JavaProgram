package linkedList;

public class PrintiIthNode {
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
	public static int printithElement(Node<Integer> head, int i) {
		int count = 0;
		Node<Integer> temp = head;
		while(temp != null) {
			if(count == i) {
				return temp.data;
			}
			count++;
			temp = temp.next;
		}
		return -1;
	}

	public static void main(String[] args) {
		Node<Integer> head = createLinkedlist();
		System.out.println(printithElement(head, 3));
	}

}
