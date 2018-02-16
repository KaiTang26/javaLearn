package com.fdmgroup.w1.exec2.abstractdir;

import com.fdmgroup.w1.exec2.interfacedir.Vehicle;

public abstract class PersonalVehicle implements Vehicle{

    private String typeOfVehicle;


//    the constructor for abstract personalVehicle

    public PersonalVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public abstract void speed(int speedValue);

    public void whistle(){

        System.out.println("Bibibibibibi");
    }

    @Override
    public void steel() {

        System.out.println("made by steel");

    }

    @Override
    public void numberOfwheels() {

        System.out.println("the number of wheels are 4");

    }
}
