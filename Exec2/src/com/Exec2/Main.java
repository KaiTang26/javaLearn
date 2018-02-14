package com.Exec2;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int num = 9;

            for (int i = 1; i <= num; i++) {

                printD(num - i);

                printNum(i);

                printD(num - i);

                System.out.printf("%n");
            }


    }

    public static void printNum(int a){

        for (int i = 1; i <= (a+a-1); i++) {

            if(i%2==0){

                System.out.print("-");
            } else {

                System.out.print(a);

            }

        }

    }

    public static void printD(int b){

        for(int i =1; i<=b; i++){
            System.out.print("-");
        }
    }
}
