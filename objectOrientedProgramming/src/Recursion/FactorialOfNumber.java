package Recursion;
// factorial number using recursion
public class FactorialOfNumber {
	public static int fact(int n) {
		if(n == 0 || n == 1) { //fact(0) = 1
			return 1;
		}
		int output = n * fact(n-1);//5*fact(4),5*4*fact(3),5*4*3*fact(2),60*2*fact(1),120*fact(0),120*1
		return output; //120
	}

	public static void main(String[] args) {
		System.out.println(fact(5)); //120
		
	}

}
