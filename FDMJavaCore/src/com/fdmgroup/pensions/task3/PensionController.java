package com.fdmgroup.pensions.task3;

public class PensionController {


    public void handlePensions(Person[] people){

        PensionLogic test = new PensionLogic();

        View execMethod = new View();

        for(int i =0; i<people.length; i++){

            if(test.isPensionable(people[i],"2014")){

                execMethod.printEligible(people[i]);
            }else{
                execMethod.printIneligible(people[i]);
            }

        }

    }
}
