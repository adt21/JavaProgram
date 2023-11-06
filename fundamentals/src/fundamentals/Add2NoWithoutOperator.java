package fundamentals;

//Add two number without using arithmetic operator

public class Add2NoWithoutOperator {
	
	public static int addition(int a, int b) {
		for(int i = 1; i <= b; i++) {
			++a;
		}
		return a;
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int ans = addition(a,b);
		System.out.println(ans);

	}

}
// Time Complexity = O(b) and space = O(1)
