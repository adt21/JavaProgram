package hashmap;

import java.util.HashMap;
import java.util.Set;

public class InbuildMapUse {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		//insert
		map.put("abc", 1);
		map.put("def", 3);
		map.put("egh", 8);
		System.out.println(map);
		System.out.println("Value of abc is: " + map.get("abc"));
		
		//size
		System.out.println(map.size());
		map.put("abc", 4);
		System.out.println("Value of abc is: " + map.get("abc"));
		
		//Search
		if(map.containsKey("abc")) {
			System.out.println("Map has abc");
		}
		
		if(map.containsKey("abc1")) {
			System.out.println("Map has abc1");
		}
		
		//get the value
		int v = map.get("abc");
		System.out.println(v);
		
//		int v1 = map.get("abc1"); null pointer exception
//		System.out.println(v1);
		int v1 = 0;
		if(map.containsKey("abc1")) {
			v1 = map.get("abc1");
		}
		System.out.println(v1);
		
		//remove
		//map.remove("abc");
		if(map.containsKey("abc")) {
			System.out.println("Map has abc");
		}
		
		//iterate
		Set<String> keys = map.keySet();
		for(String s: keys) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//value presence check
		if(map.containsValue(4)) {
			System.out.println("Yes value is present");
		}
		
		
	}

}
