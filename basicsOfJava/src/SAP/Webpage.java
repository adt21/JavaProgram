package SAP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Webpage {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<List<Integer>> webPages = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            webPages.add(new ArrayList<>());
        }

        for (int i = 1; i <= N; i++) {
            int L = sc.nextInt();
            for (int j = 0; j < L; j++) {
                int linkedPage = sc.nextInt();
                webPages.get(i).add(linkedPage);
            }
        }

        int startPage = sc.nextInt();
        int endPage = sc.nextInt();

        int minClicks = findMinimumClicks(webPages, startPage, endPage);
        System.out.println(minClicks);

        sc.close();
    }

    public static int findMinimumClicks(List<List<Integer>> webPages, int startPage, int endPage) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[webPages.size()];
        int[] clicks = new int[webPages.size()];

        queue.add(startPage);
        visited[startPage] = true;

        while (!queue.isEmpty()) {
            int currentPage = queue.poll();

            for (int linkedPage : webPages.get(currentPage)) {
                if (!visited[linkedPage]) {
                    queue.add(linkedPage);
                    visited[linkedPage] = true;
                    clicks[linkedPage] = clicks[currentPage] + 1;
                }
            }

            if (currentPage == endPage) {
                return clicks[currentPage];
            }
        }

        return -1; // End page cannot be reached from the start page
    }
}
