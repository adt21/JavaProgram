package TwoDimensionalArray;
import java.util.Scanner;
public class TransposeOfAMatrix {

	public static void main(String[] args) {
		int[][] arr = {{1,2},{3,4}};
		int[][] transpose = new int[2][2];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				transpose[i][j] = arr[j][i];
			}
		}
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
			
		}

	}

}
