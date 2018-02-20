package com.fdmgroup.pensions.task3;

public class Client {

    public static void main(String[] args){

        Person js = new Person("John", "Smith", "28/06/1993");

        Person jd = new Person("Jane", "Doe", "05/01/1950");

        Person fb = new Person("Fred", "Bloggs", "12/12/1949");

        Person[] ppl = {js,jd,fb};

        PensionController controller = new PensionController();

        controller.handlePensions(ppl);

        print("2018", "yi", "qi","8");



    }


    public static void print(String... args){

        for(int i = 0; i < args.length; i++){

            System.out.println(args[i]);
        }
    }
}
