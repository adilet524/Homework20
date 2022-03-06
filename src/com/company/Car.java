package com.company;

public class Car implements AutoCloseable{
    public void drive() {
        System.out.println("Car is riding");
    }

    public void close() {
        System.out.println("Car is closing");
    }
}

