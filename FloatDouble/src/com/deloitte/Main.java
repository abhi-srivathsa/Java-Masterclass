package com.deloitte;

public class Main {

    public static void main(String[] args) {
        float myFloatMinVal = Float.MIN_VALUE;
        float myFLoatMaxVal = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + myFloatMinVal);
        System.out.println("FLoat Maximum value = " + myFLoatMaxVal);

        double myDoubleMinVal = Double.MIN_VALUE;
        double myDoubleMaxVal = Double.MAX_VALUE;

        System.out.println("Double minimum value = " + myDoubleMinVal);
        System.out.println("Double Maximum value = " + myDoubleMaxVal);

        int myVal = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5.0 / 3.0;

        System.out.println("My int value = " + myVal);
        System.out.println("My Float Value = " + myFloat);
        System.out.println("My double value = " + myDouble);

        double pounds = 10d;
        double kilograms;

        kilograms = pounds * 0.45359237;

        System.out.println(pounds + " lbs is equal to " + kilograms + " kgs");
    }
}
