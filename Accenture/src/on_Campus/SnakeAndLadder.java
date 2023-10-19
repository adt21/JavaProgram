package on_Campus;

import java.util.HashMap;
import java.util.Scanner;

public class SnakeAndLadder {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Function to parse the board and create a HashMap to represent snakes and ladders
        int start = 1;
        int end = 100;
        HashMap<Integer, Integer> boardMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < 10; j++) {
                String cell = row[j];
                if (cell.equals("Start")) {
                    start = 1;
                } else if (cell.equals("End")) {
                    end = 100;
                } else if (cell.startsWith("S(")) {
                    int position = Integer.parseInt(cell.substring(2, cell.length() - 1));
                    boardMap.put(position, -1); // Snake
                } else if (cell.startsWith("L(")) {
                    int position = Integer.parseInt(cell.substring(2, cell.length() - 1));
                    boardMap.put(position, 1); // Ladder
                }
            }
        }

        // Read die inputs
        String[] dieInputsStr = scanner.nextLine().split(" ");
        int[] dieInputs = new int[dieInputsStr.length];
        for (int i = 0; i < dieInputsStr.length; i++) {
            dieInputs[i] = Integer.parseInt(dieInputsStr[i]);
        }

        // Function to simulate player movement
        String result = "Not possible";
        int position = start;
        int snakes = 0;
        int ladders = 0;
        for (int roll : dieInputs) {
            int newPosition = position + roll;
            if (boardMap.containsKey(newPosition)) {
                int move = boardMap.get(newPosition);
                if (move == -1) {
                    snakes++;
                } else if (move == 1) {
                    ladders++;
                }
                position = newPosition;
            }
            if (position >= end) {
                result = "Possible";
                break;
            }
        }

        System.out.println(result + " " + snakes + " " + ladders + " " + position);
    }

}
