package com.car;

/**
 * Created by MaRV on 8/7/2016.
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 1;
        car.showSpeed();
        car.setSpeed(12);
        car.showSpeed();
    }

}
