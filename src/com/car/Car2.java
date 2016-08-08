package com.car;

/**
 * Created by MaRV on 8/7/2016.
 */
public class Car2 {
    int speed;

    public void showSpeed() {
        System.out.println(this.speed);
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
        showSpeed();
        newSpeed = 8;
        speed = 3;
        setSetSpeed(newSpeed);
        showSpeed();


    }

    private void setSetSpeed(int speed) {
        speed = speed;
        this.speed = speed;

    }
}
