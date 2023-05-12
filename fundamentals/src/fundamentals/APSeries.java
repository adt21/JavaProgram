package fundamentals;
import java.util.Scanner;
public class APSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x,n=1,sum,i=1;
		x=s.nextInt();
		while(n<=x && n<=1000)
		{
			sum=(3*i)+2;
			if(sum%4!=0)
			{
				System.out.print(sum+" ");
				n=n+1;
			}
			i=i+1;
		}
	}

}
