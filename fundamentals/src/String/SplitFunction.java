package String;

public class SplitFunction {
	public static void main(String[] args) {
		String s = "Hello World I Am Aditi";
		for(String s2 : s.split("\\s",0)) {
			System.out.println(s2);
		}
		for(String s3 : s.split("\\s", 5)) { // '\\s' = regex, 5 = limit 
			System.out.println(s3);
		}
		for(String s4 : s.split("\\s", 2)) {
			System.out.println(s4);
		}
	}
}
