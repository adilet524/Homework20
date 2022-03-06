package com.company;

public class Main {
    public static void main(String[] args)   {
        int oil = 0;
        int distnceKilometr = 15;

        try (Car car = new Car()) {
            car.drive();
            System.out.println(distnceKilometr / oil);
        } catch (ArithmeticException e) {
            System.out.println("У вас нет бензина!");
        }
    }
}
