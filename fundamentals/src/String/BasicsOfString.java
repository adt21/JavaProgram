package String;

public class BasicsOfString {

	public static void main(String[] args) {
		//char arr[] = {'c','o','d','i','n','g'}; //a string internally stores a character array
		String str = "Aditi"; // Syntax of String
		//str.concat("Paul"); this will not happen because string is immutable
		//String s = str + " Paul"; // this will happen
		//System.out.println(s);
		str = str.concat(" Paul");//this will possible because .concat("Paul") by writing this a new object will be created and you have to store it for printing it. It will not automatic changed as string is immutable
		System.out.println(str);
		System.out.println(str.substring(1));
		System.out.println(str.length()); // length of the string
		System.out.println(str.charAt(3));
		String str1 = ""; /* empty string. If you will give a space in between double quote(" ") then it will print 1*/
		System.out.println(str1.length());
	}

}
