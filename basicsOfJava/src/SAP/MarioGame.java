package SAP;

import java.util.Scanner;

public class MarioGame {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int M = sc.nextInt();
		        int N = sc.nextInt();
		        sc.nextLine();

		        char[][] screen = new char[M][N];
		        for (int i = 0; i < M; i++) {
		            String row = sc.nextLine();
		            for (int j = 0; j < N; j++) {
		                screen[i][j] = row.charAt(j);
		            }
		        }

		        int coinsCollected = 0;
		        int caloriesExpended = 0;

		        for (int col = 0; col < N; col++) {
		            boolean canJump = false;
		            int jumpHeight = 0;
		            int holeHeight = -1;

		            for (int row = M - 1; row >= 0; row--) {
		                char cell = screen[row][col];

		                if (cell == 'C') {
		                    coinsCollected++;
		                } else if (cell == 'H') {
		                    if (!canJump) {
		                        canJump = true;
		                        jumpHeight = M - row;
		                    } else {
		                        holeHeight = M - row;
		                    }
		                }
		            }

		            if (holeHeight != -1) {
		                caloriesExpended += 2 * (jumpHeight - holeHeight);
		            } else if (canJump) {
		                caloriesExpended += 2 * jumpHeight;
		            }
		        }

		        System.out.println(coinsCollected + " " + caloriesExpended);
		    }
		}