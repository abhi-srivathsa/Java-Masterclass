package com.deloitte;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10000 at 2 % interest is " + calculateInterest(10000, 2));
//
//        for (int i = 2; i <= 8; i++) {
//            System.out.println("10000 at " + i + " % interest is " + String.format("%.2f", calculateInterest(10000, i)));
//        }
//        System.out.println("*******************************");
//        for (int i = 8; i >= 2; i--) {
//            System.out.println("10000 at " + i + " % interest is " + String.format("%.2f", calculateInterest(10000, i)));
//        }
        int count = 0;
        for(int i = 0; i < 10; i++){
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
            }
            if (count == 3)
                break;

        }
    }

    public static boolean isPrime( int num) {
        if (num == 1)
            return false;
        for ( int i =2; (long) i<=Math.sqrt(num); i++){
            if (num % i == 0 )
                return false;
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
