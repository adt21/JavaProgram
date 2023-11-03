package numbers;

import java.util.Scanner;

//area of circle = pi * r^2
public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius");
		int r = s.nextInt();
		double pi = 3.14;
		double ans = (pi * r * r);
		System.out.println(ans);

	}

}
