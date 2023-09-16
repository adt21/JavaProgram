package Oops;

public class practice {
	public static int palinArray(int[] a, int n)
    {
          for(int i = 0; i < n; i++){
              if(! palindrome(a[i])){
                  return 0;
              }
          }
          return 1;
    }
    
    public static boolean palindrome(int n){
        int temp = n, sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n/10;
        }
        return temp == sum;
    }
	public static void main(String[] args) {
		int n = 3;
		int[] arr = {123, 212, 313};
		int r = palinArray(arr, 3);
		System.out.println(r);
	}

}
