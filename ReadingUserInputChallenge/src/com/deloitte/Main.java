package com.deloitte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);


        while(i <= 10){
            System.out.println("Enter number #" + i);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                number = scanner.nextInt();
                sum = sum + number;
                i++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); //handling return key

        }
        System.out.println("The sum of 10 numbers is " + sum);

        scanner.close();
    }
}
