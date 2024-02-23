package nqtSheet;

import java.util.HashMap;

public class HexadecimalToBinary {
	
	public static String hexadecimal(String hex) {
		String binary = "";
		hex = hex.toUpperCase();
		
		HashMap<Character, String> map = new HashMap<>();
		map.put('0', "0000");
		map.put('1', "0001");
		map.put('2', "0010");
		map.put('3', "0011");
		map.put('4', "0100");
		map.put('5', "0101");
		map.put('6', "0110");
		map.put('7', "0111");
		map.put('8', "1000");
		map.put('9', "1001");
		map.put('A', "1010");
		map.put('B', "1011");
		map.put('C', "1100");
		map.put('D', "1101");
		map.put('E', "1110");
		map.put('F', "1111");
		
		int i;
		char ch;
		for(i = 0; i < hex.length(); i++) {
			ch = hex.charAt(i);
			if(map.containsKey(ch)) {
				binary += map.get(ch);
				
			}else {
				return "Invalid Hexdecimal Format";
			}
		}
		return binary;
	}

	public static void main(String[] args) {
		String str = "a8F";
		str = str.toUpperCase();
		String ans = hexadecimal(str);
		System.out.println(ans);

	}

}
