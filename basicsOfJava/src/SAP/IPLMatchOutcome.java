package SAP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IPLMatchOutcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] matchResults = new String[54];
        for (int i = 0; i < 54; i++) {
            matchResults[i] = sc.nextLine();
        }

        String[] rankings = new String[8];
        for (int i = 0; i < 8; i++) {
            rankings[i] = sc.nextLine();
        }

        List<String> remainingMatches = new ArrayList<>(Arrays.asList("DC vs RR", "SRH vs KKR"));

        List<String> possibleOutcomes = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            String[] teams = remainingMatches.get(i).split(" vs ");
            String team1 = teams[0];
            String team2 = teams[1];

            for (int j = 0; j < 2; j++) {
                int team1Points = 0;
                int team2Points = 0;

                String matchResult = matchResults[52 + i * 2 + j];

                if (matchResult.startsWith(team1)) {
                    team1Points += 2;
                } else if (matchResult.startsWith(team2)) {
                    team2Points += 2;
                } else {
                    team1Points += 1;
                    team2Points += 1;
                }

                String[] matchData = matchResult.split(" ");
                int projectedTeam1Score = Integer.parseInt(matchData[1].split("/")[0]);
                int projectedTeam2Score = Integer.parseInt(matchData[4].split("/")[0]);

                if (matchResult.contains(team1)) {
                    int runsDifference = projectedTeam1Score - projectedTeam2Score;
                    int runRate = runsDifference * 2;
                    team1Points += runRate;
                } else {
                    int runsDifference = projectedTeam2Score - projectedTeam1Score;
                    int runRate = runsDifference * 2;
                    team2Points += runRate;
                }

                String outcome = "WIN:" + team1 + "|LOSE:" + team2 + "||WIN:" + team2 + "|LOSE:" + team1;

                if (team1Points > team2Points) {
                    possibleOutcomes.add(outcome);
                }
            }
        }

        possibleOutcomes.sort(String::compareTo);
        possibleOutcomes.forEach(System.out::println);
    }
}