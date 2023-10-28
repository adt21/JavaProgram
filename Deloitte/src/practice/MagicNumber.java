package practice;

public class MagicNumber {
	
	public static boolean isMagic(int n)
	{
		int sum = 0;
		while(n > 0 || sum > 9) {
			if(n == 0) {
				n = sum;
				sum = 0;
			}
			sum += n%10;
			n = n/10;
		}
		return sum == 1;
	}
	public static void main(String[] args) {
		
		int n = 10;
		boolean b = isMagic(n);
		System.out.println(b);
		
	}

}
