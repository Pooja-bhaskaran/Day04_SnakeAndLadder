package com.Bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("***** Snake and Ladder Game *****");
        int Position = 0;
        int dieRoll =(int) (Math.random()*6)+1;
        System.out.println("The Game Starts at position number: " + Position);
        System.out.println("The dieRoll value is : " + dieRoll);
    }
}
