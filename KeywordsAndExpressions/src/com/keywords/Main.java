package com.keywords;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        if(score < 5000){
//            System.out.println("Your score was 5000");
//
//        } else if(score ==5000){
//
//            System.out.println("Got here");
//        } else{
//            System.out.println("haha");
//        }

        System.out.println(Score(true, 1000, 8,300));

        Score(true, 10000, 16,300);

        displayHighScorePosition("Kai", 1000);

        //System.out.println(calculateHighScorePosition(10000));

        double centimeter = calcFeetAndInchesToCentimeters(100);

        System.out.println(centimeter);



    }


    public static int Score(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = -1;


        if (gameOver){
            finalScore = score +(levelCompleted*bonus);

            return finalScore;
//            System.out.println("Your final score was " + finalScore);
        }

        return finalScore;
    }

    public static void displayHighScorePosition(String name, int score){

        int position = calculateHighScorePosition(score);

        System.out.println(name + " managed to get into position "+ position);

    }

    public static int calculateHighScorePosition(int score){

        if(score>=1000){

            return 1;

        }else if(score > 500 && score < 1000){

            return 2;

        }else if(score > 100 && score < 500){

            return 3;

        }else{

            return 4;

        }

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if(feet>=0 && (inches >=0 && inches <= 12)){

            return feet*30.48+inches*2.54;

        }else{

            return -1;
        }


    }

    public static double calcFeetAndInchesToCentimeters(double its){

        if(its>=0){
            double feet = (int) its/12;
            double inches = (int)its%12;

            return calcFeetAndInchesToCentimeters(feet, inches);

        }else{

            return -1;
        }


    }
}
