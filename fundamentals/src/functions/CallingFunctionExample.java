package functions;

public class CallingFunctionExample {
	public static void b() { // called by a()
		System.out.println("Inside b");
	}
	public static void a() {
		b(); // here Caller a() and Callee b()
		System.out.println("Inside a");
	}
	public static void main(String[] args) {
		a(); // here Caller main() and Callee a()
		System.out.println("Inside main"); 
	}

}
