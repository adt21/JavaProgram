package arrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(); // Syntax of a ArrayList, here used generic in array list
//if you want to insert element in array list then just do as per below syntax
		arr.add(10);
		arr.add(20);//inserted 20 after 10
		arr.add(30);//inserted 30 after 20
		arr.set(2, 90);
		System.out.println(arr.get(1));
		System.out.println(arr.size());
		arr.add(1, 80); // inserted element at particular index (index-1, element-80), now the ArrayList look like(10,80,20,30)
		System.out.println(arr.size()); // to know about the size of array
		System.out.println(arr.get(2)); // to know the element at particular index
		arr.set(2, 60); //set means element at index 2 will be replace by 60 and look like:(10,80,60,30)
		arr.remove(1);// look like (10,60,30)
		System.out.println(arr.size());
//		System.out.println(arr.get(0));
//		System.out.println(arr.get(1));
//		System.out.println(arr.get(2));
		for(int i = 0; i <arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}

	}

}
