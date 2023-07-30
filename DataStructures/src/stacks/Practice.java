package stacks;

public class Practice {

	public static void main(String[] args) {
		int data[] = new int[2];
		int[] temp = data;
		data = new int[2 * data.length];
		System.out.println(temp.length); // 
		System.out.println(data.length);
	}

}
