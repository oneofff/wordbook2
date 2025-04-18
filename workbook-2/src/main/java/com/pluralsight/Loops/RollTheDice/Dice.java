package com.pluralsight.Loops.RollTheDice;

import lombok.Data;

@Data
public class Dice {
    private int sides = 6;
    private int value = 1;

    public int roll() {
      return (int) Math.round(Math.random() * sides + 1);
    }
}
