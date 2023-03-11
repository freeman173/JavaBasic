package com.jc.xiancheng;

/*
@author ����
@since version-1.0
@date 2023/2/14 20:33
@description :
        ���µ�ͬ��������lock��


*/


import java.util.concurrent.locks.ReentrantLock;

class TicketsLock implements Runnable{
    private int ticketNum=100;

    /*
        ����һ��������
    */
    private ReentrantLock reentrantLock=new ReentrantLock(true);

    @Override
    public void run() {
        while(true){
            reentrantLock.lock();//����
            if(ticketNum>0){

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"��Ʊ��"+ticketNum);
                ticketNum--;
            }else break;
            reentrantLock.unlock();//����
        }

    }
}


public class Demo4 {
    public static void main(String[] DF){
        TicketsLock ticketsLock=new TicketsLock();

        Thread t1=new Thread(ticketsLock,"1");
        Thread t2=new Thread(ticketsLock,"2");
        Thread t3=new Thread(ticketsLock,"3");
        t1.start();t2.start();t3.start();



    }

}