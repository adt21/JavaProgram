package String;
//time Complexity O(n)
public class ReverseEachWord2 {
	
	public static String makereverse(String str) {
		 StringBuilder s = new StringBuilder(str);
		 str = s.reverse().toString();
		 String[] arr = str.split(" ");
		 StringBuilder reverse = new StringBuilder();
		 for(int i = arr.length - 1; i >= 0; i--) {
			 reverse.append(arr[i]).append(" ");
		 }
		 return reverse.toString();
	}

	public static void main(String[] args) {
		String str = "Hii How Are You";
		String s = makereverse(str);
		System.out.println(s);
	}

}
