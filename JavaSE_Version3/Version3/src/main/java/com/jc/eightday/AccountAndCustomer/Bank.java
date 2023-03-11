package com.jc.eightday.AccountAndCustomer;




//银行
public class Bank {

    private Customer[] customers=new Customer[10];//客户组最多10个
    private int numberOfCustomers;//客户个数



    /*
        添加客户
     */
    public void addCustomer(String name){
        Customer customer=new Customer(name,new Account(1000,0.0123));
        this.customers[numberOfCustomers++]=customer;
//        numberOfCustomers
        System.out.println("用户添加成功");

    }


    /*
       得到用户个数
     */
    public int getNumberOfCustomers() {
        System.out.println("用户个数："+this.numberOfCustomers);
        return numberOfCustomers;
    }




}
