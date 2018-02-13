package com.switchs;

public class forLoop {

    public static void main(String[] args){

//        for(int i=8; i>=2; i--){
//
//            System.out.println(String.format("%.2f",calculate(10000, i)));
//        }

        int count =0;

        for(int i = 2; i<100; i++){
            if(isPrime(i)){
                count++;
                System.out.println(i);
            }



            if(count>=10){
                break;
            }
        }

    }

    public static double calculate(double amount, double rate){

        return(amount*(rate/100));
    }


    public static boolean isPrime(int n){

        if(n==1){
            return false;

        }

        for(int i =2; i<= n/2; i++){

            if((n % i) == 0) {
                return false;
            }

        }

        return true;
    }
}
