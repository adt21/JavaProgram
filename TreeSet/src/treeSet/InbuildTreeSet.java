package treeSet;
import java.util.TreeSet;
public class InbuildTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		
		// insert
		
		set.add(10);
		set.add(8);
		set.add(20);
		set.add(1);
		System.out.println(set);
		
		//size
		
		System.out.println("Size of the set is: " + set.size());
		
		//higher method whereas it return the next higher value than the given number
		System.out.println(set.higher(8));
		
		//search
		
		if(set.contains(20)) {
			System.out.println("YES, 20 is present");
		}
		
		//remove
		
		set.remove(20);
		System.out.println(set);
		
		//compare
		
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(10);
		set1.add(8);
		set1.add(20);
		set1.add(1);
		boolean b = set.equals(set1);
		System.out.println(b + " in equality");
		
		//Iterate
		
		for(Integer i: set) {
			System.out.print(i + " ");
		}
		//( Or you can import java.util.Iterator and can use .hasNext() and .next() same as HASHSET
		
		
	}

}
