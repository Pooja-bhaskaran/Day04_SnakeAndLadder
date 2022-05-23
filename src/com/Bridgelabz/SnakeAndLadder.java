package com.Bridgelabz;

import java.util.Random;

import static java.lang.Math.random;

public class SnakeAndLadder {

    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    static final int SNAKE = 3;

    public static void main(String[] args) {
        int position = 0;
        System.out.println("positionCheck: " + position);
//        Random random = new Random();
        int diceRoll = (int) (random() * 6) + 1;
        System.out.println("dice: " + diceRoll);

        int option = (int) (random() * 3)+1;
        System.out.println("optionCheck: " + option);


        for (position = 0; position <= 100; position++) {

            if ((option == LADDER) && (position + diceRoll) <= 100) {
                System.out.println("!! LADDER !! The player will move ahead");
                position = position + diceRoll;
            } else if (option == SNAKE) {
                System.out.println("!! SNAKE !! The player position will be reduced");
                position = position - diceRoll;
            } else {
                System.out.println("!! NO_PLAY !! The player will remain in the Same Position");
                position = position;
            }
            if (position < 0) {
                System.out.println("The player should restart from 0th position");
                position = 0;
            }
            System.out.println("current position: " + position);
        }
    }
}