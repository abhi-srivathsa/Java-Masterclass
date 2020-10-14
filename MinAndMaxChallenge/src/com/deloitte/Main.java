package com.deloitte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number;
        Scanner scanner = new Scanner(System.in);
        int minimum = 0;
        int maximum = 0;
        boolean first = true;

	    while(true){
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                number = scanner.nextInt();
                if(number > maximum || first)
                    maximum = number;
                if(number < minimum || first)
                    minimum = number;

            } else {
                break;
            }
            first = false;
        }

        System.out.println("The maximum number entered is " + maximum + " and the minimum number entered is " + minimum);
    }
}
