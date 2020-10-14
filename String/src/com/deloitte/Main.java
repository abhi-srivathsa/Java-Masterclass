package com.deloitte;

public class Main {

    public static void main(String[] args) {
	    // int
        // byte
        // long
        // short
        // char
        // boolean
        // float
        // double

        String myString = "This is a string";
        myString += " , This is more.";

        System.out.println("My string is equal to " + myString);

        myString = myString + "\u00A9";
        System.out.println(myString);

        String numberString = "250.99";
        numberString += "49.85";

        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;

        lastString += myInt;
        System.out.println(lastString);

        double myDouble = 20.5;
        lastString += myDouble;
        System.out.println(lastString);
    }
}
