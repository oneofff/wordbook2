package com.pluralsight.Loops.RollTheDice;

public class RollTheDiceApplication {
    public static void main(String[] args) {
        Dice dice = new Dice();
        RollResults rollResults = new RollResults();

        for (int i = 0; i < 10000; i++) {
            int roll1 = dice.roll();
            int roll2 = dice.roll();
            int sum = roll1 + roll2;
            System.out.println("Roll 1: " + roll1 + " - " + "Roll 2: " + roll2 + " Sum: " + (roll1 + roll2));
            rollResults.incrementCount(sum);
        }
        rollResults.printHistogram();
    }
}
