package generics;

public class MultupleGenericUse {

	public static void main(String[] args) {
		MultupleGeneric<String, Integer> mSI = new MultupleGeneric<>("Aditi", 20);
		System.out.println(mSI.getFirst() + " " + mSI.getSecond());

	}

}
