package Pattern;
import java.util.Scanner;
public class TrianglePattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		   int i,j,m,a;
		   for(i=1;i<=n;i++)
		   {
		       for(int k=n-1;k>=i;k--)
		          System.out.print(" ");
		       a=i;
		       for(j=0;j<i;j++)
		          System.out.print(a++);
		       a--;    
		       for(m=i-1;m>0;m--)
		          System.out.print(--a);
		       System.out.println(" ");    
		   }
			}
		}
