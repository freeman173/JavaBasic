package com.jc.eightday.AccountAndCustomer;




//����
public class Bank {

    private Customer[] customers=new Customer[10];//�ͻ������10��
    private int numberOfCustomers;//�ͻ�����



    /*
        ��ӿͻ�
     */
    public void addCustomer(String name){
        Customer customer=new Customer(name,new Account(1000,0.0123));
        this.customers[numberOfCustomers++]=customer;
//        numberOfCustomers
        System.out.println("�û���ӳɹ�");

    }


    /*
       �õ��û�����
     */
    public int getNumberOfCustomers() {
        System.out.println("�û�������"+this.numberOfCustomers);
        return numberOfCustomers;
    }




}
