package LinkedMapSet;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedhashmapImplement {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Aditi");
		map.put(4,"Apsara");
		map.put(3, "Shivam");
		map.put(8, "Priya");
		System.out.println(map);
		
		if(map.containsKey(4)) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
		
		if(map.containsValue("Apsara")) {
			System.out.println(map.get(1));
		}
	}

}
