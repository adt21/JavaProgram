package SAP;
import java.util.Scanner;

public class PriestNirvana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] snakes = new int[M][4];
        for (int i = 0; i < M; i++) {
            String snakeName = sc.next();
            String[] startBlock = sc.next().split(",");
            String[] endBlock = sc.next().split(",");
            snakes[i][0] = Integer.parseInt(startBlock[0]);
            snakes[i][1] = Integer.parseInt(startBlock[1]);
            snakes[i][2] = Integer.parseInt(endBlock[0]);
            snakes[i][3] = Integer.parseInt(endBlock[1]);
        }

        String priestStart = sc.next();
        sc.close();

        char direction = priestStart.charAt(0);
        int start = Integer.parseInt(priestStart.substring(1));
        int row = 0, col = 0;

        if (direction == 'N') {
            row = 1;
            col = start;
        } else if (direction == 'S') {
            row = N;
            col = start;
        } else if (direction == 'E') {
            row = start;
            col = N;
        } else if (direction == 'W') {
            row = start;
            col = 1;
        }

        while (true) {
            if (row < 1 || row > N || col < 1 || col > N) {
                System.out.println("NIRVANA");
                break;
            }

            boolean snakeKilled = false;
            for (int i = 0; i < M; i++) {
                if (row >= snakes[i][0] && row <= snakes[i][2] && col >= snakes[i][1] && col <= snakes[i][3]) {
                    snakeKilled = true;
                    System.out.println("Snake " + (i + 1) + " at (" + row + "," + col + ")");
                    break;
                }
            }

            if (snakeKilled) {
                break;
            }

            if (direction == 'N') {
                row++;
            } else if (direction == 'S') {
                row--;
            } else if (direction == 'E') {
                col--;
            } else if (direction == 'W') {
                col++;
            }
        }
    }
}