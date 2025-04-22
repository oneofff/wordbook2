package com.pluralsight.TestStatistics;

import java.util.Arrays;

public class TestStatisticsApplication {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 89, 84, 91};
        Arrays.sort(scores);
        System.out.println("Average: " + calculateAverage(scores));
        System.out.println("Median: " + calculateMedian(scores));
        System.out.println("Highest: " + scores[scores.length - 1]);
        System.out.println("Lowest: " + scores[0]);
    }

    private static double calculateMedian(int[] scores) {
        int length = scores.length;
        if (length % 2 == 0) {
            return (scores[length / 2 - 1] + scores[length / 2]) / 2.0;
        } else {
            return scores[length / 2];
        }
    }

    private static double calculateAverage(int[] scores) {
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}
