package treemap;
import java.util.TreeMap;
import java.util.Set;
public class InbuildTreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> t = new TreeMap<>();
		//Add
		t.put("Nilanjana", 3);
		t.put("Aditi", 2);
		t.put("Sudipta", 1);
		t.put("Ankita", 4);
		t.put("Asmit", 6);
		System.out.println(t); //it always return sorted keys(either it integer or String)
		
		//size
		System.out.println(t.size());
		
		//Iterate Keys
		Set<String> keys = t.keySet();
		for(String k: keys) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		//Search
		if(t.containsKey("Aditi")) {
			System.out.println("YES, This is Aditi");
		}
		
		//remove
		t.remove("Ankita");
		System.out.println(t);
		
		//get value
		int v = t.get("Sudipta");
		System.out.println(v);
		
		//replace
		t.replace("Aditi", 5);
		System.out.println(t);
		
	}

}
