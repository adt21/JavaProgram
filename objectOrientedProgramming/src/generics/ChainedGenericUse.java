package generics;

public class ChainedGenericUse {

	public static void main(String[] args) {
		MultupleGeneric<String, Integer> m1 = new MultupleGeneric<String, Integer>("ab",100);
		MultupleGeneric<MultupleGeneric<String, Integer> , String> m = new MultupleGeneric<>();
		m.setFirst(m1);
		System.out.println(m.getFirst());
		System.out.println(m.getFirst().getFirst());
		System.out.println(m.getFirst().getSecond());
		
//		m.setSecond("aditi");
//		System.out.println(m.getSecond());

	}

}
