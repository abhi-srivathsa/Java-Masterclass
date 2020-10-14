package com.deloitte;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum value = " + myMinValue );
        System.out.println("Integer Maximum value = " + myMaxValue );
        System.out.println("Busted Maximum value = " + (myMaxValue + 1));
        System.out.println("Busted Minimum value = " + (myMinValue - 1));
        int myMaxIntTest = 2147483647;


        byte myMinByteVal = Byte.MIN_VALUE;
        byte myMaxByteVal = Byte.MAX_VALUE;

        System.out.println("Byte Minimum value = " + myMinByteVal);
        System.out.println("Byte Maximum value = " + myMaxByteVal);

        short myMinShortVal = Short.MIN_VALUE;
        short myMaxShortVal = Short.MAX_VALUE;

        System.out.println("Short Minimum value = " + myMinShortVal);
        System.out.println("Short Maximum value = " + myMaxShortVal);

        long myLongVal = 100L;

        long myMinLongVal = Long.MIN_VALUE;
        long myMaxLongVal = Long.MAX_VALUE;

        System.out.println("Long Minimum value = " + myMinLongVal);
        System.out.println("Long Maximum value = " + myMaxLongVal);

        long myLongTestVal = 2147483648L;

        System.out.println(myLongTestVal);

        int myTotal = myMinValue/2;
        byte myNewByte = (byte) (myMinByteVal/2);


        //Challenge
        int myInt = 10;
        byte myByte = 100;
        short myShort = 2000;
        long myLong = 50000L + (10 * (myInt + myByte + myShort));

        System.out.println("output : " + myLong);

    }
}
