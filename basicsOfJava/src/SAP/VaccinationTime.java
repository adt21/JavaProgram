package SAP;

import java.util.Arrays;
import java.util.Scanner;

public class VaccinationTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int N = sc.nextInt();

        int[] population = new int[N];
        for (int i = 0; i < N; i++) {
            population[i] = sc.nextInt();
        }

        Arrays.sort(population);
        int center1Capacity = 0;
        int center2Capacity = 0;
        int totalTime = 0;

        for (int i = N - 1; i >= 0; i--) {
            if (center1Capacity <= center2Capacity) {
                center1Capacity += population[i];
                totalTime += center1Capacity * m1;
            } else {
                center2Capacity += population[i];
                totalTime += center2Capacity * m2;
            }
        }

        System.out.println(totalTime);
        sc.close();
    }
}