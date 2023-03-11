package com.jc.eightday.CustomerInformation;


public class CustomerList {

    private Customer[] customers;
    private int total;//记录保存客户的当前数量

//    构造函数
    public CustomerList(int totalCustomer) {
        customers=new Customer[totalCustomer];
    }

    /*
        增加用户
     */
    public boolean addCustomer(Customer customer){
        if(this.total>=customers.length){//判断数组容量
            return false;
        }
        this.customers[total++]=customer;
        return true;
    }


    /*
        替代用户
     */
    public boolean replaceCustomer(int index,Customer customer){
        if(index<0 || index>this.total){
            return false;
        }
        this.customers[index]=customer;
        return true;
    }

    /*
        删除用户
     */
    public boolean deleteCustomer(int index){
        if(index<0 || index>this.total){
            return false;
        }

        for(int i=index;i<total-1;i++){//将数组元素向前移动一位
            customers[i]=customers[i+1];

        }

        customers[total-1]=null;//将最后元素置空
        total--;
        return true;
    }
    /*
        获取当前所有用户

     */
    public Customer[] getAllCustomers(){
        if(total==0){//如果无元素，直接返回空值即可！
            return null;
        }
        Customer[] customers=new Customer[this.total];
        for(int i=0;i<=this.total-1;i++){
            customers[i]=this.customers[i];
        }
        return customers;
    }

        /*
            获取指定下标的用户
         */
    public Customer getCustomer(int index){
        if(index<0 || index>total-1){//如果越界，返回空值
            return null;
        }
        return customers[index];
    }

    /*
     获取当前用户数量
  */
    public int getTotal(){

        return total;
    }



}
