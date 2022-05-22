package com.Bridgelabz;

import javax.swing.text.html.Option;

import java.util.Random;

import static java.lang.Math.random;

public class SnakeAndLadder {

    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    static final int SNAKE = 3;

    public static int diceRoll() {
        int diceRoll = (int) (random() * 6) + 1;
//      System.out.println("DiceRoll Number : " + diceRoll);
        return diceRoll;
    }

    public static void main(String[] args) {
        System.out.println("***** Snake and Ladder Game *****");
        int position = 0;
        diceRoll();
        option();
        int option = option();
        int diceRoll = diceRoll();
        System.out.println("DiceRoll Number : " + diceRoll);
        System.out.println("checking the option : " + option);

        switch (option) {
            case NO_PLAY:
                System.out.println("Player is in Same Position");
                break;
            case LADDER:
                if (diceRoll > 0) {
                    position = diceRoll + option;
                    break;
                }
            case SNAKE:
                position -= diceRoll;
                break;
        }
        System.out.println("Current Position : " + position);
    }

    public static int option() {
        Random random = new Random();
        int option = random.nextInt(3) + 1;
//      System.out.println("Checking the option : " + option);
        return option;
    }

}
