package com.jc.eightday.CustomerInformation;


public class CustomerList {

    private Customer[] customers;
    private int total;//��¼����ͻ��ĵ�ǰ����

//    ���캯��
    public CustomerList(int totalCustomer) {
        customers=new Customer[totalCustomer];
    }

    /*
        �����û�
     */
    public boolean addCustomer(Customer customer){
        if(this.total>=customers.length){//�ж���������
            return false;
        }
        this.customers[total++]=customer;
        return true;
    }


    /*
        ����û�
     */
    public boolean replaceCustomer(int index,Customer customer){
        if(index<0 || index>this.total){
            return false;
        }
        this.customers[index]=customer;
        return true;
    }

    /*
        ɾ���û�
     */
    public boolean deleteCustomer(int index){
        if(index<0 || index>this.total){
            return false;
        }

        for(int i=index;i<total-1;i++){//������Ԫ����ǰ�ƶ�һλ
            customers[i]=customers[i+1];

        }

        customers[total-1]=null;//�����Ԫ���ÿ�
        total--;
        return true;
    }
    /*
        ��ȡ��ǰ�����û�

     */
    public Customer[] getAllCustomers(){
        if(total==0){//�����Ԫ�أ�ֱ�ӷ��ؿ�ֵ���ɣ�
            return null;
        }
        Customer[] customers=new Customer[this.total];
        for(int i=0;i<=this.total-1;i++){
            customers[i]=this.customers[i];
        }
        return customers;
    }

        /*
            ��ȡָ���±���û�
         */
    public Customer getCustomer(int index){
        if(index<0 || index>total-1){//���Խ�磬���ؿ�ֵ
            return null;
        }
        return customers[index];
    }

    /*
     ��ȡ��ǰ�û�����
  */
    public int getTotal(){

        return total;
    }



}
