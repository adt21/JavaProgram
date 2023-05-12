package TwoDimensionalArray;
import java.util.Scanner;
public class FunctionOf2dArray {
	public static void printing2dArray(int[][] arr){
		int rows = arr.length;
		int cols = arr[0].length;
		for(int i = 0; i<rows;i++) {
			for(int j = 0; j<cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public static int[][] takingInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of row");
		int rows = s.nextInt();
		System.out.println("Enter number of column");
		int cols = s.nextInt();
		int arr[][] = new int[rows][cols];
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols;j++) {
				System.out.println("Enter the element at " + i + " row"+ j + " column");
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int input[][] = takingInput();
		printing2dArray(input);

	}

}
