package com.pluralsight.Loops.RollTheDice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dice {
    private int sides = 6;

    public int roll() {
        RandomGenerator random = RandomGeneratorFactory.of("L64X128MixRandom").create();
        return random.nextInt(1, sides + 1);
    }
}
