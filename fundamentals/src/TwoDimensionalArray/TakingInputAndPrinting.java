package TwoDimensionalArray;
import java.util.Scanner;
public class TakingInputAndPrinting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = s.nextInt();
		System.out.println("Enter the number of coloumns");
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.println("Enter the element at"+ " " + i + " " + "row" + " " + j + " " + "coloumn");
				arr[i][j] = s.nextInt();
			}
		}
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
