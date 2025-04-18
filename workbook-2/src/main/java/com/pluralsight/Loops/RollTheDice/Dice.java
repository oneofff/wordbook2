package com.pluralsight.Loops.RollTheDice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dice {
    private int sides = 6;

    public int roll() {
      return (int) (Math.random() * sides) + 1;
    }
}
