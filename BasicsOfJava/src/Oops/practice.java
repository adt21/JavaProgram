package Oops;

//import java.util.Scanner;

public class practice {
	public static int check(int n) {
		int arr[] = new int[1000];
        int i = 0;
        while(n > 0){
            arr[i] = n % 2;
            n = n / 2;
            i++;
        }
        for(int j = 0; j < i; j++){
            if(arr[j] == 1){
            	return (j + 1);
            }
        }
        return 0;
	}
	
	public static void main(String[] args) {
		int r = check(19);
		System.out.println(r);
		
		
	}
}
