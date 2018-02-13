package com.switchs;

public class Account {
    private int account_number;

    private double balance;

    private String customer_name;

    private String email;

    private int phone_number;

    public Account(int account, double balance, String name, String email, int number){

        this.account_number = account;
        this.balance = balance;
        this.customer_name = name;
        this.email = email;
        this.phone_number = number;
    }



    public Account(){
        this(1, 0, "haha", "@mail", 123);
    }
    public void setAccount(int account_number){

        this.account_number =  account_number;

    }

    public void setBalance(double balance){

        this.balance =  balance;

    }

    public void setCustomer_name(String name){
        this.customer_name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getAccount(){

        return this.account_number;

    }

    public double getBalance(){

        return this.balance ;

    }

    public String getCustomer_name(){
        return this.customer_name ;
    }

    public String getEmail(){
        return this.email;
    }

    public void deposit(double amount){
            this.balance += amount;

            System.out.println("the current balance is: "+this.balance);

    }

    public void withdrawal (double amount){

        System.out.println("ha");

        if((this.balance-amount) > 0){

            this.balance -= amount;

            System.out.println("the current balance is: "+this.balance);

        }else{

            System.out.println("fuck out");
        }



    }
}
