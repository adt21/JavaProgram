package dataStructure;

/*
 * Question is: insert a node at tail in a linkedList and if head == null that means
 *  linked list is empty, for that case create condition.
 */

public class InsertNode {
	

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int data) {

		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
		newNode.data = data;
		newNode.next = null;
		if (head == null) {
			head = newNode;
			return head;
		}
		LinkedListNode<Integer> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return head;

	}

	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> n1 = new LinkedListNode<Integer>(10);
		LinkedListNode<Integer> ans = insert(n1, 20);
		print(ans);

	}

}
