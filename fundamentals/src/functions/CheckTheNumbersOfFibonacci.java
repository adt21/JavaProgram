package functions;

public class CheckTheNumbersOfFibonacci {
	public static boolean checkNumber(int n) {
		 int a=0;
	        int b=1;
	        if(n==0)
	        {
	            return true;
	        }
	        while((a+b)<=n)
	        {int temp=a+b;
	         a=b;
	         b=temp;
	         
	         if(n==temp )
	         {
	             return true;
	         }
	        }
		return false;
	}
	
}
