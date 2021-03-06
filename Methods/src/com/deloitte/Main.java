package com.deloitte;

public class Main {

    public static void main(String[] args) {
//        int highScore = calculateScore(true, 4000, 5, 100);
//        System.out.println("Your final score was " + highScore);
//        highScore = calculateScore(true, 10000, 8, 200);
//        System.out.println("Your final score was " + highScore);
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Messi", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Ronaldo", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Neymar", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Mbappe", position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void displayHighScorePosition ( String name, int position) {
        System.out.println(name + " managed to get into position " + position + " in the high score table");
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + levelCompleted * bonus;
            finalScore += 2000;
            return finalScore;
        }
        return -1;

    }
}
