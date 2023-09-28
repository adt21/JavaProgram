package LinkedMapSet;


import java.util.LinkedHashSet;

public class LinkedhashsetImplement {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Pooja");
		set.add("Aditi");
		set.add("Naina");
		System.out.println(set);
		
		if(set.contains("Naina")) {
			System.out.println("Found");
		}
		
		
	}

}
