package com.switchs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        compare('C');
    }

    public static void compare(char test){

        Car porsche = new Car();

        porsche.setModel("911");

        System.out.println(porsche.getModel());

        Account haha = new Account();

        haha.setBalance(10000);

        haha.withdrawal(1000000000);

        Account lala = new Account();

        System.out.println(lala.getBalance());

        switch(test){
            case 'A':
                System.out.println("A has been found ");
                break;

            case 'B':
                System.out.println("B has been found ");
                break;

            case 'C':
                System.out.println("C has been found ");
                break;

            case 'D':
                System.out.println("D has been found ");
                break;

            case 'E':
                System.out.println("E has been found ");
                break;

            default:
                System.out.println("not found");
                break;
        }
    }
}
