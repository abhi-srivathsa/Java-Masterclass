package com.deloitte;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car toyota = new Car();

        porsche.setModel("Carrera");
        System.out.println("The model of the Porsche car is " + porsche.getModel());
        toyota.setModel("Fortuner");
        System.out.println("The model of the Toyota is " + toyota.getModel());

    }
}
