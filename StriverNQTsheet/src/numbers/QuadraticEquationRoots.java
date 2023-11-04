package numbers;

public class QuadraticEquationRoots {
	
	public static void roots(int a, int b, int c) {
		if(a == 0) {
			System.out.println("Invalid");
			return;
		}
		double root1, root2;
		double determinant = (b * b) - 4*a*c;
		double sqrt_val = Math.sqrt(Math.abs(determinant));
		
		if(determinant > 0) {
			System.out.println("Roots are real and different");
			root1 = (double) (-b + sqrt_val)/ (2*a);
			root2 = (double) (-b - sqrt_val)/ (2*a);
			System.out.println(root1 + "\n" + root2);
		}
		else if(determinant == 0) {
			System.out.println("Roots are real and equal");
			root1 = root2 = (-b)/(2*a);
			System.out.println(root1);
		}
		else { // determinant < 0 or (b^2 - 4ac <0)
			System.out.println("Roots are complex and different");
			System.out.println((-b)/(2*a) + " + i " + sqrt_val/(2*a) + "/n" + (-b)/(2*a) + " - i " + sqrt_val/(2*a));
		}
	}

	public static void main(String[] args) {
		int a = 1, b = 4, c = 1;
		roots(a, b, c);

	}

}
