package linkedList2;

import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();//this linked list class mainly doubly linked list
		list.add(10);
		list.add(20);//this add function will automatic insert after 10
		list.add(30);
		list.add(60);
		list.add(70);
		list.add(50);
		list.add(1, 40);
		list.set(2, 20);
		list.addFirst(90);
		list.remove(); // this will automatic remove the 1st element
//		list.clear(); //this clear all the elements in the linked list
		System.out.println(list.size());
		System.out.println(list.get(1));
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		

	}

}
