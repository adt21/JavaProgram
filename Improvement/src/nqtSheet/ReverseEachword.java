package nqtSheet;

public class ReverseEachword {
	
	public static String reversestring(String str) {
		String sb = new StringBuilder(str).reverse().toString();
		return sb;
		
	}
	
	public static void reverse(String str) {
		String[] arr = str.split("\\s");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = reversestring(arr[i]);
		}
		for(String s: arr) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String str = "Hii How Are You";
		reverse(str);
	}

}
