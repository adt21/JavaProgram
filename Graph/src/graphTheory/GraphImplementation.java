package graphTheory;
import java.util.*;
public class GraphImplementation {

	public static void main(String[] args) {
		int n = 3, m = 3;
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i <= n; i++) {
			arr.add(new ArrayList<Integer>());
		}
		
		arr.get(1).add(2);
		arr.get(2).add(1);
		
		arr.get(2).add(3);
		arr.get(3).add(2);
		
		arr.get(1).add(3);
		arr.get(3).add(1);
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < arr.get(i).size(); j++) {
				System.out.print(arr.get(i).get(j) + " ");
			}
			System.out.println();
		}
		
	}

}
