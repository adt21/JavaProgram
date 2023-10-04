package lambdaExpression;

/*
 *  It is an inner class without a name and for which only a single object is created.
 *   An anonymous inner class can be useful when making an instance of an object with
 *    certain “extras” such as overriding methods of a class or interface, without having
 *     to actually subclass a class.
 */

interface A{
	void show();
}

//class X implements A{
//	public void show() {
//		System.out.println("Hello");
//	}
//}

public class AnonymousClass {

	public static void main(String[] args) {
		
		A obj = new A() { //this is a anonymous class that is without a class name
			
			public void show() {
				System.out.println();
			}
		};
//		obj = new X();
//		obj.show();

	}

}

/*
 * But one thing can you see that we create this anonymous class just only
 * for executing the show() method even though we do this inside interface A
 * but why we do this ? Is there any other good option ?
 * YES, it's solution is Lambda expression. kindly check lambda.java class
 */
