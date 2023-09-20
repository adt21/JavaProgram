package gfg;

/*
 * It basically means: Example- binary of 12 = 01100 so the position of first bit(1) from right side
 * is 3 you have to find this position. another example 18: 010010 ( position of 1 from right side = 2)
 */
public class FindFirstSetBit {
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
