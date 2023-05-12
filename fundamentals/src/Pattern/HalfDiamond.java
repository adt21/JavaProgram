package Pattern;
import java.util.Scanner;
public class HalfDiamond {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nr = (n*2)+1;
		int nst = 1;
		for(int i=1;i<=nr;i++) {
			int val = 1;
			for(int j =1; j<=nst;j++) {
				if(j == 1 || j == nst) {
					System.out.print("*");
				}
				else {
					System.out.print(val);
					if(j<= nst/2) {
						val++;
					}
					else{
						val--;
					}
				}
			}
		
		System.out.println();
		if(i<= nr/2) {
			nst = nst + 2;
		}
		else {
			nst = nst - 2;
		}
	  }
	}
}
