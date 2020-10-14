package com.deloitte;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("abhi", 50);
//        System.out.println("New score is " + newScore);
//
//        newScore = calculateScore(100);
//        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6, -2);
        System.out.println(centimeters);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0) && (inches <= 12)) {
            double newInches = feet * 12;
            return ((newInches + inches) * 2.54);
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = inches / 12;
            feet = Math.floor(feet);
            inches = inches % 12;
           return calcFeetAndInchesToCentimeters(feet, inches);
        }
        return -1;
    }
//    public static void calculateScore() {
//        System.out.println("No player, no score");
//    }
//
//    public static int calculateScore(String playerName, int score) {
//        System.out.println("player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }

}
