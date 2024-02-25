package nqtSheet;

public class CheckTriangle {

	public static void main(String[] args) {
		int x = 9, y = 9, z = 9;
		
		if(x == y && y == z) {
			System.out.println("Equilateral Triangle");
		}
		else if(x == y || y == z || x == z) {
			System.out.println("Isosceles Triangle");
		}else {
			System.out.println("Scalene Triangle");
		}

	}

}
