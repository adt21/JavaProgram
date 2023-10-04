package Array;

public class WaveArrayGFG {
	
	public static void wave(int a[], int n) {
		for(int i = 0; i < n -1; i+=2) {
			int temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
		}
		for(int j: a) {
			System.out.print(j + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		wave(a,a.length);

	}

}
