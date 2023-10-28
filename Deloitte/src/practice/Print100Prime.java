package practice;

//Print prime numbers between 1 to 100

public class Print100Prime {
	
	public static void prime() {
		int n = 100;
		for(int i = 2; i <= n; i++) { //this loop is for traversing element 2 to 100 (from 2 as 0 & 1 is not prime)
			boolean isPrime = true;
			
			for(int j = 2; j < i; j++) { // this loop is for checking is prime or not that's why we divide the number by it's less number
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		prime();
	}

}
