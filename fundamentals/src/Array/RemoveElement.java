package Array;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[20];
		System.out.println("Enter the size of the array you want");
		int n = s.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the array element at " + i + "th index");
			arr[i] = s.nextInt();
		}
		//deletion
		System.out.println("Enter the positon of the Array for delete element");
		int pos = s.nextInt();
		for(int i = pos; i < n; i++) {
			arr[i] = arr[i+1];
		}
		--n;
		for(int j = 0; j < n; j++) {
			System.out.print(arr[j] + " "); 
		}
	}

}
