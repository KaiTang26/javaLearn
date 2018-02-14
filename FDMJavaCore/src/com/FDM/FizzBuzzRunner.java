package com.FDM;

public class FizzBuzzRunner {

    private boolean fizz(int num){

        if((num%3 ==0)&&(num%5 !=0)){
            return true;
        }else{
            return false;
        }

    }

    private boolean buzz(int num){

        if((num%3 !=0)&&(num%5 ==0)){
            return true;
        }else{
            return false;
        }

    }

    private boolean fizzbuzz(int num){

        if((num%3 ==0)&&(num%5 ==0)){
            return true;
        }else{
            return false;
        }

    }



    public void fizzBuzz(int lastNum){

        for(int i=1; i<= lastNum; i++){

            if(fizz(i)){
                System.out.println("Fizz");

            }else if(buzz(i)){
                System.out.println("Buzz");

            }else if(fizzbuzz(i)){
                System.out.println("FizzBuzz");

            }else{
                System.out.println(i);
            }

        }

    }
}
