package fundamentals;

public class ContinueStatement {

	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		while(i <= n) {
			i++;
			if(i == 4) 
				continue;
				System.out.println(i);
	/*i++;if you write here i++ then after printing 1,2,3 there is nothing to print because 4 again back and
				stuck in the continue part*/
			
		}

	}

}
