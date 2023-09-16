package List;
/*
 * List is an interface that implements ArrayList and Linkedlist 
 */
import java.util.ArrayList;
import java.util.List;

public class ListImplementation {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		
		li.add("Aditi");
		li.add("Akankha");
		
		System.out.println(li.get(1));
		li.remove(1);
		System.out.println(li.get(0));
		
	}

}
