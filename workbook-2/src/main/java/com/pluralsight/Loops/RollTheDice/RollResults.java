package com.pluralsight.Loops.RollTheDice;

import lombok.Data;

@Data
public class RollResults {
    private long countOf2 = 0;
    private long countOf3 = 0;
    private long countOf4 = 0;
    private long countOf5 = 0;
    private long countOf6 = 0;
    private long countOf7 = 0;
    private long countOf8 = 0;
    private long countOf9 = 0;
    private long countOf10 = 0;
    private long countOf11 = 0;
    private long countOf12 = 0;

    public void incrementCount(int sum) {
        switch (sum){
            case 2 -> countOf2++;
            case 3 -> countOf3++;
            case 4 -> countOf4++;
            case 5 -> countOf5++;
            case 6 -> countOf6++;
            case 7 -> countOf7++;
            case 8 -> countOf8++;
            case 9 -> countOf9++;
            case 10 -> countOf10++;
            case 11 -> countOf11++;
            case 12 -> countOf12++;
        }
    }


    public void printHistogram() {
        System.out.println("Roll Results (Histogram):");
        long maxCount = Math.max(
                Math.max(Math.max(Math.max(Math.max(countOf2, countOf3), countOf4), countOf5), countOf6),
                Math.max(Math.max(Math.max(Math.max(countOf7, countOf8), countOf9), countOf10), Math.max(countOf11, countOf12))
        );

        int scale = maxCount > 50 ? (int) Math.ceil(maxCount / 50.0) : 1;

        System.out.println("2:  " + "*".repeat((int) (countOf2 / scale)));
        System.out.println("3:  " + "*".repeat((int) (countOf3 / scale)));
        System.out.println("4:  " + "*".repeat((int) (countOf4 / scale)));
        System.out.println("5:  " + "*".repeat((int) (countOf5 / scale)));
        System.out.println("6:  " + "*".repeat((int) (countOf6 / scale)));
        System.out.println("7:  " + "*".repeat((int) (countOf7 / scale)));
        System.out.println("8:  " + "*".repeat((int) (countOf8 / scale)));
        System.out.println("9:  " + "*".repeat((int) (countOf9 / scale)));
        System.out.println("10: " + "*".repeat((int) (countOf10 / scale)));
        System.out.println("11: " + "*".repeat((int) (countOf11 / scale)));
        System.out.println("12: " + "*".repeat((int) (countOf12 / scale)));
        System.out.println("\n(Note: Each * represents approximately " + scale + " rolls)");
    }
}
