package fundamentals;
//import java.util.Scanner;
public class DecimalToBinary {
	
	public static void convert(int n) {
		int[] arr = new int[40];
		int i = 0;
		while(n > 0) {
			
			arr[i] =  n % 2;
			n = n/2;
			i++;
		}
		for(int j = i -1; j >= 0; j--) {
			System.out.print(arr[j]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int binary = 0, pow = 1;
//		while(n > 0) {
//			int rem = n % 2;
//			binary = binary + rem * pow;
//			n = n/2;
//			pow*=10;
//		}
//		System.out.print(binary);
		convert(19);
	}

}
