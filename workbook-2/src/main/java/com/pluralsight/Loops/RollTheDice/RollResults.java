package com.pluralsight.Loops.RollTheDice;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class RollResults {
    private Map<Integer, Long> results = new HashMap<>();


    public void incrementCount(int sum) {
        results.put(sum, results.getOrDefault(sum, 0L) + 1);
    }


    public void printHistogram() {
        System.out.println("Roll Results (Histogram):");
        long maxCount = results.values().stream()
                .max(Long::compare)
                .orElse(0L);

        int scale = maxCount > 50 ? (int) (maxCount / 50) : 1;

        for (Map.Entry<Integer, Long> entry : results.entrySet()) {
            int sum = entry.getKey();
            long count = entry.getValue();
            int stars = (int) (count / scale);
            System.out.println(sum + ": " + "*".repeat(stars));
        }

        System.out.println("\n(Note: Each * represents approximately " + scale + " rolls)");
    }
}
