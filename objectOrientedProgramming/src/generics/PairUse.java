package generics;

public class PairUse {

	public static void main(String[] args) {
//		Pair p = new Pair(10,20);
//		System.out.println(p.getFirst() + " " + p.getSecond());
		
		Pair<String> p = new Pair<String>();
		System.out.println(p.getFirst() + " " + p.getSecond());

		Pair<String> pS = new Pair<String>("aditi", "Paul"); // creating object for generic
		System.out.println(pS.getFirst() + " " + pS.getSecond());
		
		Pair<Integer> pI = new Pair<Integer>(10,20); // you can't write Primitive Data type here because here needed only non primitive data type
		System.out.println(pI.getFirst() + " " + pI.getSecond());
		
		//int is a data type in java but Integer is a class which is already exist in java, Integer is a Wrapper class also , you can use wrapper class in generic
		
		
		Pair<Double> pD = new Pair<Double>(10.89,20.60);
		System.out.println(pD.getFirst() + " " + pD.getSecond());
	}

}
