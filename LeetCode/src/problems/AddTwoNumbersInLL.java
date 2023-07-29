package problems;

import java.util.Scanner;

public class AddTwoNumbersInLL {
	
	public static void printLL(LLNode<Integer> head) {
		LLNode<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static LLNode<Integer> takingInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		LLNode<Integer> head = null, tail = null;
		while(data != -1) {
			LLNode<Integer> currentNode = new LLNode<Integer>(data);
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}
			else {
				tail.next = currentNode;
				tail = currentNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static LLNode<Integer> addNumberInLL(LLNode<Integer> l1, LLNode<Integer> l2){
		LLNode<Integer> dummy = new LLNode<Integer>();
		LLNode<Integer> temp = dummy;
		int carry = 0;
		while(l1 != null || l2 != null || carry == 1) {
			int sum = 0;
			if(l1 != null) {
				sum += l1.data;
				l1 = l1.next;
			}
			
			if(l2 != null) {
				sum += l2.data;
				l2 = l2.next;
			}
			sum += carry;
			carry = sum / 10; // if sum 12 then carry will be 12/10 = 1
			LLNode<Integer> newLLNode = new LLNode<Integer>(sum % 10); // if sum 12 then new node contain 12%10 = 2 
			temp.next = newLLNode;
			temp = temp.next;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		System.out.println("Give the input for 1st LinkedList");
		LLNode<Integer> head1 = takingInput();
		System.out.println("Give the input for 2nd LinkedList");
		LLNode<Integer> head2 = takingInput();
		System.out.println("So, the 1st LinkedList be like: ");
		printLL(head1);
		System.out.println("So, the 1st LinkedList be like: ");
		printLL(head2);
		System.out.println("After adding two numbers of LinkedList: ");
		LLNode<Integer> result = addNumberInLL(head1, head2);
		printLL(result);
		
	}

}
/*
 * ****  if you want to replace the addition value in any of the given LL without creating new linked list
 * then solution is in below
 * 
 * public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
    LLNode<Integer> temp1 = l1; // Store references to the heads of both lists

    while (l1 != null || l2 != null) {
        int sum = 0;

        if (l1 != null) {
            sum += l1.data;
            l1 = l1.next;
        }

        if (l2 != null) {
            sum += l2.data;
            l2 = l2.next;
        }

        sum += carry;
        carry = sum / 10;
        temp1.data = sum % 10; // Store the sum in the first linked list
        temp1 = temp1.next; // Move to the next node in the first linked list
    }

    // If there is still a carry after the loop, create a new node and add it at the end
    while (carry > 0) {
        LLNode<Integer> newNode = new LLNode<Integer>(carry);
        temp1.next = newNode;
        temp1 = temp1.next;
        carry /= 10;
    }

    return l1; // Return the head of the modified first linked list
}
*/
