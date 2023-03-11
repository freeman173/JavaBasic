package com.jc.xiancheng;

/*
������һ���˻������������ֱ���ͬһ���˻���3000��ÿ�δ�1000����3�Σ�
ÿ�δ����ӡ�˻���

1����Ҫ�����洢�߳�
2���˻����Ϊ�������ݣ���Ҫ�����߳�ͬ�����⣩



*/


//�˻�
class Account{
    private double balance;

//    ��Ǯ����Ӧ����һ��ͬ��������
    public synchronized void deposit(double money) throws Exception {
        if(money>0){
            balance+=money;
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"��Ǯ�ɹ�"+"�˻���"+balance);
        }else throw new Exception("��Ǯʧ��");
    }



}


class Customer implements Runnable{

//    ����һ���˻���
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
        Thread thread1=new Thread(customer,"�û�1");
        Thread thread2=new Thread(customer,"�û�2");
        thread1.start();thread2.start();


    }


}