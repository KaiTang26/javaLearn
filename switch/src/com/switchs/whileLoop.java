package com.switchs;

public class whileLoop {

    public static void main(String[] args){

        System.out.println(isEvenNumber(4));

        int number = 5;

        int finishNumber = 20;

        int count = 0;

        while(number<=finishNumber){
            if(!isEvenNumber(number)){

                number++;

                continue;
            }

            if(count>=5){

                System.out.println(count);

                break;
            }else{

                count++;
            }

            number++;
        }

    }

    public static boolean isEvenNumber(int test){
        if((test%2)==0){
            return true;
        }

        return false;
    }
}
