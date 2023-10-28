package array;

import java.util.Arrays;

/*
 * Question: Write a program in java to analyse the characters in the string str and find N which is the number of 
occurrence of the highest ASCII value. Then print the character having lowest ASCII value in str, N
times. The string Str can contain special characters or alphanumeric or mix of all. The string can
represent in any case. Read the input from keyboard and return the output }
Constraints: Length of str>0
Input:
The input will be a string to be analysed 

Output: The output contains lowest ASCII equivalent character value printed N times
Sample input:
ABOVEtheheight
Sampleoutput1:
A
A
 */

public class AsciiValueProblem {
	
	public static int frequency(int arr[], int data) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == data) {
				++count;
			}
		}
		return count;
	}
	
	public static void ascii(String str) {
		
		char[] charArr = str.toCharArray();
		int[] arr = new int[charArr.length];
		for(int i = 0; i < charArr.length; i++) {
			arr[i] = charArr[i];
		}
		Arrays.sort(arr);
		char highest = (char) arr[arr.length-1];
		System.out.println("Highest ascii value is: " + highest);
		int f = frequency(arr, arr[arr.length-1]);
		
		char lowest = (char) arr[0];
		for(int i = 0; i < f; i++) {
			System.out.println(lowest);
		}
		
	}

	public static void main(String[] args) {
		String str = "ABOVEtheheight";
		ascii(str);
	}

}
