package com.jc.xiancheng;

/*
银行有一个账户：两个储户分别向同一个账户存3000，每次存1000、存3次，
每次存完打印账户余额。

1、需要两个存储线程
2、账户余额为共享数据（需要考虑线程同步问题）



*/


//账户
class Account{
    private double balance;

//    存钱操作应该做一个同步操作！
    public synchronized void deposit(double money) throws Exception {
        if(money>0){
            balance+=money;
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"存钱成功"+"账户余额："+balance);
        }else throw new Exception("存钱失败");
    }



}


class Customer implements Runnable{

//    共用一个账户！
    private static Account account=new Account();

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            try {
                account.deposit(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


public class Demo5 {

    public static void main(String[] D){
        Customer customer=new Customer();
        Thread thread1=new Thread(customer,"用户1");
        Thread thread2=new Thread(customer,"用户2");
        thread1.start();thread2.start();


    }


}