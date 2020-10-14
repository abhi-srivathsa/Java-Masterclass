package com.deloitte;

public class Main {

    public static void main(String[] args) {
//        int count = 0;
//        while(count != 5) {
//            System.out.println("the count is " + count);
//            count++;
//        }
//
//        count = 1;
//        while(true){
//            if (count == 5) {
//                break;
//            }
//            System.out.println("the count is " + count);
//            count++;
//        }
//
//        do {
//            System.out.println("the count is " + count);
//            count++;
//            if(count == 100)
//                break;
//        }while(count != 5);
        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEven(number))
                continue;
            count++;
            System.out.println("Even number " + number);
            if(count == 5)
                break;

        }
        System.out.println(count + " even numbers found");
    }

    private static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        return false;
    }
}
