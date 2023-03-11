package com.jc.eightday.AccountAndCustomer;

//�����˻�
public class Account {
    private static int static_id=1;
    private int id;
    private double balance;
    public double annualInterestRate;//������

    public Account(double balance, double annualInterestRate) {
        this.id = static_id++;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

//    ȡǮ
    public void withdraw(double amount){
        if(amount>this.getBalance()){
            System.out.println("�����ˣ�");
            return;
        }
        this.balance-=amount;
    }

//    ��Ǯ
    public void deposit(double amount){
        if(amount>0){
            this.balance+=amount;
            System.out.println("�ɹ�����"+amount);
        }
    }

}
