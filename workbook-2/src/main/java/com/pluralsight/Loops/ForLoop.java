package com.pluralsight.Loops;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        // For loop to print "I love Java" 5 times
        for (int i = 10; i > 0; i--) {
            Thread.sleep(1000);

            System.out.println(i);
        }
        System.out.println("Launch!");


    }
}
