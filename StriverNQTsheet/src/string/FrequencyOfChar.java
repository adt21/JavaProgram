package string;

public class FrequencyOfChar {
	
	public static void frequency(String str) {
		char[] arr = str.toCharArray();
		boolean[] b = new boolean[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			if(b[i] == true) {
				continue;
			}
			int count = 1;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					b[j] = true;
				}
			}
			System.out.println(arr[i] + " " + count);
		}
	}

	public static void main(String[] args) {
		String str = "HelloWorld";
		frequency(str);
	}

}
