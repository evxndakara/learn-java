package com.in28minutes.oops;

import java.math.BigDecimal;

//new class
public class MotorBike {

    //property kelas
    private int speed;

    //constructor default
    public MotorBike() {
    }

    //constructor custom 1 (int speed)
    public MotorBike(int speed) {
        this.speed = speed;
    }

    //constructor custom 2 (sout)
    public MotorBike(String pooigeriordeutgoire) {
        System.out.println("hasil param dari konstrukto: " + pooigeriordeutgoire + speed);
    }

    //method
    public void start() {
        System.out.println("Bike Started");
    }

    //getter
    public int getSpeed() {
        return speed;
    }

    //setter
    public void setSpeed(int speed) {
        if (speed > 0)
            this.speed = speed;
    }

    //method
    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }

    public void stop() {
        System.out.println("bike sto p p ed!!!");
    }


}


































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































