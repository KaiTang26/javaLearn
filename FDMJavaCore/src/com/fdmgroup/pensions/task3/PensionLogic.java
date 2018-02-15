package com.fdmgroup.pensions.task3;

public class PensionLogic {

    public boolean isPensionable(Person person, String year){

       String[] time = person.getDateOfBirth().split("/");

       int birthYear = Integer.parseInt(time[2]);

       int testYear = Integer.parseInt(year);


       if((testYear-birthYear)>=65){

           return true;
       }else{

           return false;
       }

    }
}
