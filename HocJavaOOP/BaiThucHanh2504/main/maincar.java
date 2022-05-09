package main;
import car.car;
import car.taxicar;

public class maincar {
    public static void main(String[] args) {
        car car = new taxicar();
        car.move();
    }
}
