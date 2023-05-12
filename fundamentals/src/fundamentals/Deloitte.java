package fundamentals;

public class Deloitte {
	public static void main(String[] args) {
		int x = 4;
		int y = 10;
		if(x % y == 0) {
			System.out.println(x);
		}else {
			x = x * 10;
			if(x % y == 0) {
				System.out.println(x);
			}
		}
		while(x % y != 0) {
			x = x + 1;
			if(x % y == 0) {
				System.out.println(x);
			}
		}
	}
}
