package tcsCodevita;

import java.util.Scanner;

public class GoodString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input good string
        String goodString = scanner.nextLine();

        // Input student's name
        String studentName = scanner.nextLine();

        // Calculate and print the total distance
        int totalDistance = calculateTotalDistance(goodString, studentName);
        System.out.println(totalDistance);

        scanner.close();
    }

    private static int calculateTotalDistance(String goodString, String studentName) {
        int totalDistance = 0;

        // Initialize previousGoodLetter with the first letter of good string
        char previousGoodLetter = goodString.charAt(0);

        for (char studentLetter : studentName.toCharArray()) {
            if (goodString.indexOf(studentLetter) != -1) {
                // If the letter is already in the good string, no need to change it
                continue;
            }

            // Calculate distances to each good letter
            int minDistance = Integer.MAX_VALUE;
            char selectedGoodLetter = ' ';

            for (char goodLetter : goodString.toCharArray()) {
                int distance = Math.abs(goodLetter - studentLetter);
                if (distance < minDistance || (distance == minDistance && goodLetter < selectedGoodLetter)) {
                    minDistance = distance;
                    selectedGoodLetter = goodLetter;
                }
            }

            // Update total distance and previousGoodLetter
            totalDistance += minDistance;
            previousGoodLetter = selectedGoodLetter;
        }

        return totalDistance;
    }
}

