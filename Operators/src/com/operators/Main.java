package com.operators;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Q1

        double numFirst = 20d;

        double numSecond = 80d;

        double sum = (numFirst + numSecond)*25;

        System.out.println(sum);

        double remainder = sum % 40;

        System.out.println(remainder);

        if(remainder<=20){

            System.out.println("Total was over the limit");
        }
    }
}
