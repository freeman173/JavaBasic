package com.jc.eightday.AccountAndCustomer;

//¹Ë¿Í
public class Customer {


    private String name;
    private Account account;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, Account account) {
        this.name = name;
        this.account=account;
    }

    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
