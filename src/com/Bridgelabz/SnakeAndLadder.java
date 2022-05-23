package com.Bridgelabz;

import java.util.Random;

public class SnakeAndLadder {

    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    static final int SNAKE = 3;
    static int diceCount = 0;
    static final int PLAYER1 = 1;
    static final int PLAYER2 = 2;

    public static int positionCheck(int dice,int CurrentPosition, int optionCheck) {
        if ((optionCheck == LADDER) && (CurrentPosition + dice) <= 100) {
            System.out.print(" ***** ladder **** ");
            CurrentPosition = CurrentPosition + dice;
        } else if (optionCheck == SNAKE) {
            System.out.print("!!!!!! snake !!!!! ");
            CurrentPosition = CurrentPosition - dice;
        } else {
            System.out.print(" /////  NoPlay ///// ");
            CurrentPosition = CurrentPosition;
        }
        if (CurrentPosition < 0) {
            CurrentPosition = 0;
        }
        System.out.println("CurrentPosition : " + CurrentPosition);
        return CurrentPosition;
    }

    public static void main(String[] args) {
        int playerOnePosition = 0;
        int playerTwoPosition = 0;
        int player = PLAYER1;
        System.out.println("playerOnePosition : " + playerOnePosition);
        System.out.println("playerTwoPosition : " + playerTwoPosition);
        Random ran = new Random();

        while ((playerOnePosition < 100) && (playerTwoPosition < 100)) {

            int dice = ran.nextInt(6) + 1;
            System.out.println("dice : " + dice);
            ++diceCount;
            int optionCheck = ran.nextInt(3) + 1;
            System.out.println("optionCheck : " + optionCheck);

            if (player == PLAYER1) {
                playerOnePosition = positionCheck(dice, playerOnePosition, optionCheck);
                if ((optionCheck == SNAKE) || (optionCheck == NO_PLAY)) {
                    player = PLAYER2;
                }
            } else if (player == PLAYER2) {
                playerTwoPosition = positionCheck(dice, playerTwoPosition, optionCheck);
                if ((optionCheck == SNAKE) || (optionCheck == NO_PLAY)) {
                    player = PLAYER1;
                }
            }
        }
        System.out.println("PlayerOnePosition : " + playerOnePosition);
        System.out.println("PlayerTwoPosition : " + playerTwoPosition);
        System.out.println("diceCount: " + diceCount);
        if (playerOnePosition == 100) {
            System.out.println("Player_1 Wins");
        } else {
            System.out.println("Player_2 Wins");
        }
    }
}