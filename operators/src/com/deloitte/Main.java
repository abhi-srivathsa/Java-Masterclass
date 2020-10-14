package com.deloitte;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(" 1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous result = " + previousResult);
        result = result - 1;
        System.out.println(" 3 - 1 = " + result);
        System.out.println(" Previous Result = " + previousResult);

        result = result * 10; //2 * 10 = 20
        System.out.println(" 2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println(" 20 / 5 = " + result);

        result = result % 3; // remainder of 4 % 3 = 1
        System.out.println(" 4 % 3 = " + result );

        result++; // 1 + 1 = 2
        System.out.println(" 1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println(" 2 - 1 = " + result);

        result += 2; // 1 + 2 = 3
        System.out.println(" 1 + 2 = " + result);

        result *= 10; // 3 * 10 = 30
        System.out.println(" 3 * 10 = " + result);

        result /= 3; //30 / 3 = 10
        System.out.println(" 30 / 3 = " + result);

        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;

        if ( isAlien == false ) {
            System.out.println("It is not an alien");
            System.out.println("And I'm scared of aliens");
        }

        int topScore = 80;
        if ( topScore < 100 ) {
            System.out.println("You've got the high score");
        }

        int secondTopScore = 60;
        if ( (topScore > secondTopScore) && (topScore < 100) ) {
            System.out.println("Greater than second top score but less than 100");
        }

        if( (topScore > 90) || (secondTopScore <=90)) {
            System.out.println(" either top score is greater than 90 or second top score is less than or equal to 90");
        }

        int value = 50;
        if ( (value = 20) == 20)
            System.out.println("true");

        boolean isCar = false;
        if (!isCar)
            System.out.println(" true ");

        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);


        double firstVal = 20.00d;
        double secondVal = 80.00d;
        double firstResult = (firstVal + secondVal) * 100.00;
        double secondResult = firstResult % 40.00;
        boolean thirdResult = (secondResult == 0) ? true : false;
        System.out.println("The remainder is " + thirdResult);
        if ( !thirdResult ) {
            System.out.println(" Got some remainder ");
        }

    }
}
