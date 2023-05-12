package String;
import java.util.Scanner;
public class TcsFindingIndex {
	public static void findIndex(String str, char c) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				System.out.print(i + " "); // first = 2, second = 4
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char c = s.next().charAt(0); // taking input for character
		findIndex(str,c);
	}

}
