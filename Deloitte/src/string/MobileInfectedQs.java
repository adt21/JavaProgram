package string;

/*
 * Qs: John worked as a technical expert for a mobile company where he analysis if
mobile are infected by virus or not? . The complete information of each mobile is
coded in the form of string str. A mobile is infected by a virus if input string is a
special string. A special string is called if all character at alternate position
starting from index O are same.

Test Case 1:

Input : ADAOAS

Output : 1
 */

public class MobileInfectedQs {
	
	public static boolean specialString(String str) {
		Character c = str.charAt(0);
		for(int i = 2; i < str.length(); i+=2) {
			if(str.charAt(i) != c){ //if at any step 1st character not equal to it's alternate position then return false
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "ADAOCS";
		
		if(specialString(str)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

	}

}
