package arrays;

import java.util.Scanner;

public class Matrix {
	
	public static int[][] takingInput(int rows, int cols){
		Scanner s = new Scanner(System.in);
//		int rows = s.nextInt();
//		int cols = s.nextInt();
		int[][] arr2d = new int[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				arr2d[i][j] = s.nextInt();
			}
		}
		return arr2d;
	}
	
	public static void findElement(int arr2d[][], int rows, int cols, int x) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(arr2d[i][j] == x) {
					System.out.println("Element found at (" + i + " " + j +") index");
				}
			}
		}
	}
	
	public static void print(int[][] arr2d, int rows, int cols) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(arr2d[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter row number");
		int rows = s.nextInt();
		System.out.println("Enter column number");
		int cols = s.nextInt();
		System.out.println("Enter the elements in the matrix");
		int arr[][] = takingInput(rows, cols);
		System.out.println("Matrix is:- ");
		print(arr, rows, cols);
		System.out.println("Enter the element you want to find");
		int x = s.nextInt();
		findElement(arr, rows, cols, x);

	}

}
