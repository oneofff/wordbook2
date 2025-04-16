package main.java.com.pluralsight.HighScoreWins;

import java.util.Scanner;

public class HighScoreWinsApplication {
    public static void main(String[] args) {
        System.out.println("Enter the gameDetails score in the format Home:Visitor|homeScore:visitorScore");
        Scanner scanner = new Scanner(System.in);
        String gameScore = scanner.nextLine().trim();
        scanner.close();
        String[] gameDetails = gameScore.split("\\|");
        String[] teams = gameDetails[0].split(":");
        String[] scores = gameDetails[1].split(":");
        if (Integer.parseInt(scores[0]) > Integer.parseInt(scores[1])) {
            System.out.println(teams[0] + " wins with a score of " + scores[0] + ":" + scores[1]);
        } else if (Integer.parseInt(scores[0]) < Integer.parseInt(scores[1])) {
            System.out.println(teams[1] + " wins with a score of " + scores[1] + ":" + scores[0]);
        } else {
            System.out.println("The gameDetails is a tie with a score of " + scores[0] + ":" + scores[1]);
        }
    }
}
