package Exceptions;

public class ExceptiosDemo {
	public static int fact(int n) throws NegativeNumberException {
		if(n < 0) {
			throw new NegativeNumberException();
		}
		int ans = 1;
		for(int i = 1; i <= n; i++) {
			ans = ans * i;
		}
		return ans;
	}
	// throw is a exception object
	//either you can pass it(that is throw declaration)exception or you can handle it(try-catch)
	//whom will pass exception? = that which you called
	public static int divide(int a, int b) throws DivideByZeroExceptions { //pass the exception
		if(b == 0) {
			throw new DivideByZeroExceptions();
		}
		return a/b;
	}

	public static void main(String[] args) {
		//if it wants to deal with this exception then try catch block is required
		try {
			divide(10, 0); // after exception in try block then it entered direct in catch block
			//and run it
			System.out.println(fact(2));
			System.out.println("within Main");//this line is after an exception line in try block
			//that's why it does not run, direct entered in catch block
			//but there is no exception in try block then it does not enter in catch block
		} catch (DivideByZeroExceptions e) {
			
			//e.printStackTrace();
			System.out.println("Divide by zero exception raised");
		} catch (NegativeNumberException e) {
			
			//e.printStackTrace();
			System.out.println("Negative number Exception");
		}finally {
			System.out.println("Finally");//finally is a block that always executed what so happen whether 
			//exception is arised or not , it is bound to be executed
		}
		System.out.println("Main");
	}

}


//if there is no exception catch will not execute try will definitely execute for all the time
