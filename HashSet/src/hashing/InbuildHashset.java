package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class InbuildHashset {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		//add element
		
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(6);
		
		//HASHSET does not allow duplicate value , so here 6 will be print for once like [4, 5, 6]
		//print all HASHSET containing element
		System.out.println(set);
		
		//search element
		
		if(set.contains(6)) {
			System.out.println("It contains 6");
		}
		if(! set.contains(9)) {
			System.out.println("Yes, it does not contain 9");
		}
		
		//remove
		
		set.remove(6);
		
//		System.out.println(set);
		
		if(! set.contains(6)) {
			System.out.println("We deleted it");
		}
		
		//Iterator, which is present in HASHSET that helps us to traverse the HASHSET and we need to import it
		//we use Iterator in Hash set as HASHSET does not has any index
		Iterator i = set.iterator();
		
		//Iterator has two important function 1) .hasNext() 2) .next()
		
		//.next() will print the next element in HASHSET and initially it refers to null
		//.hasNext() it returns either true or false if there is no next element during traversing then 
		//it will return false, if there then return true
		
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}

}
