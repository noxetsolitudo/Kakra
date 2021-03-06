package com.company.L5_17_rockPaperScissors;

public class Launcher {
    public static void main(String[] args) {

        Game game = new Game();
        game.gameStart();
//        game.conditions();
        game.scannerClose();
        game.results();

    }
}
