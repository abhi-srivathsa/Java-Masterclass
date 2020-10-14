package com.deloitte;

public class Main {

    public static void main(String[] args) {
        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was" + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        char charValue = 'E';

        switch (charValue) {
            case 'A':
                System.out.println("Character was A");
                break;
            case 'B':
                System.out.println("Character was B");
                break;
            case 'C':
                System.out.println("Character was C");
                break;
            case 'D':
                System.out.println("Character was D");
                break;
            case 'E':
                System.out.println("Character was E");
                break;
            default :
                System.out.println("None of A, B, C, D, and E was found");
        }
        String month = "January";

        switch(month.toLowerCase()) {
            case "january" :
                System.out.println("January");
                break;
            case "february" :
                System.out.println("February");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
