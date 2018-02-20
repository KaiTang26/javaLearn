package com.fdmgroup.w1.exec2.com.fdmgroup.w1.exec2.main;

import com.fdmgroup.w1.exec2.abstractdir.PersonalVehicle;

public class Car extends PersonalVehicle{

    public Car(String typeOfVehicle) {
        super(typeOfVehicle);
    }

    @Override
    public void speed(int speedValue) {
        System.out.println("the top speed of this car is "+speedValue);
    }
}
