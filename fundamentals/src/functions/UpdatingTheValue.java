package functions;

public class UpdatingTheValue {
	public static int increment(int n) {
		n++;
		//System.out.println("Increment" + " " + n);
		return n;
	}

	public static void main(String[] args) {
		int n = 10;
		n = increment(n); // it is very very important to store incremented or updated value in variable n.
		System.out.println("Main" + " " + n);
	}

}
