package Array;

public class BasicsOfArray {

	public static void main(String[] args) {
		int arr[] = new int[10]; // syntax of array
		arr[0] = 5;
		arr[5] = 17;
		System.out.println(arr[5]);
		char cArray[] = new char[10];
		double dArray[] = new double[10];
		System.out.println(cArray[5]);
		System.out.println(dArray[0]);

	}

}
/* when you declare an array then value of the items inside array will automatically inialized as 0(for integer)
 * thats why here we get 0.0 for double and null for char.
 */
