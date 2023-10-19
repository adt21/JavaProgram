package on_Campus;

import java.util.Arrays;
import java.util.Scanner;

public class CupsAndJugs {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of cups
        int N = scanner.nextInt();

        // Read the capacities of the cups
        int[] cups = new int[N];
        for (int i = 0; i < N; i++) {
            cups[i] = scanner.nextInt();
        }

        // Read the capacity of the jug
        int L = scanner.nextInt();

        // Sort the cups in ascending order
        Arrays.sort(cups);

        int[] frequency = new int[N];
        int jugCapacity = L;
        int cupIndex = N - 1; // Start from the largest cup

        while (jugCapacity > 0 && cupIndex >= 0) {
            while (cupIndex >= 0 && cups[cupIndex] <= jugCapacity) {
                // Use the largest cup that fits in the jug
                jugCapacity -= cups[cupIndex];
                frequency[cupIndex]++;
            }
            cupIndex--;
        }

        // Output the selected cups and their frequencies
        for (int i = 0; i < N; i++) {
            if (frequency[i] > 0) {
                System.out.print(cups[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            if (frequency[i] > 0) {
                System.out.print(frequency[i] + " ");
            }
        }
    }
}
