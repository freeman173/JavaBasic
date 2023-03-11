package com.jc.xiancheng;


/*
@author ����
@since version-1.0
@date 2023/2/12 20:58
@description :
    ͬ�������Ʊ����:
        �̷߳���Ʊ�������������ʱ�����뻥�⣺
                ʹ��ͬ������飺
                    synchronized��ͬ����������{//ͬ������������Ϊһ��������󣬵��������ͬһ����
                        ͬ�����룺�����������ݵĴ���
                    }

*/
class TicketsTongbuOne extends Thread{
    private static int ticketNum=100;

    @Override
    public void run() {
        while(true) {
            synchronized (Object.class) {//������һ��ֻ����һ���߳̽���
                if (ticketNum > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "��Ʊ��" + ticketNum);
                    ticketNum--;
                } else break;
            }
        }
    }
}

class TicketsTongbuTwo implements Runnable{
    private static int ticketNum=100;

    @Override
    public void run() {
        while(true){
            synchronized (Object.class){
            if(ticketNum>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"��Ʊ��"+ticketNum);
                ticketNum--;
            }else break;
        }
        }
    }
}

/*
@author ����
@since version-1.0
@date 2023/2/12 20:58
@description :
    ͬ�������Ʊ����:
        �̷߳���Ʊ�������������ʱ�����뻥�⣺
                ʹ��ͬ��������
                    ͬ������Ҳ��ͬ������
                        �Ǿ�̬��this
                        ��̬����ǰ��


*/

class TicketsTongbuThree implements Runnable{
    private static int ticketNum=100;

    @Override
    public void run() {
        while(true){
                if(show()==false) break;
            }
    }

    private synchronized boolean show(){//ͬ��������Ĭ��Ϊ"this"
        if(ticketNum>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"��Ʊ��"+ticketNum);
            ticketNum--;
            return true;
        }else {
            return false;
        }


    }

}


class TicketsTongbuFour extends Thread{
    private static int ticketNum=100;

    @Override
    public void run() {
        while(true) {
                if(show()==true) break;
            }

    }
    private static synchronized boolean show(){//ͬ����Ϊ.class����
        if (ticketNum > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "��Ʊ��" + ticketNum);
            ticketNum--;
            return false;
        }else return true;

    }


}


public class Demo3 {
    public static void main(String[] args){
//        TicketsTongbuFour ticketsTongbuOne=new TicketsTongbuFour();
//        TicketsTongbuFour ticketsTongbuTwo=new TicketsTongbuFour();
//        TicketsTongbuFour ticketsTongbuThree=new TicketsTongbuFour();
//        ticketsTongbuOne.start();ticketsTongbuTwo.start();ticketsTongbuThree.start();
        TicketsTongbuThree ticketsTongbuThree=new TicketsTongbuThree();
        Thread threadOne=new Thread(ticketsTongbuThree,"1");
        Thread threadTwo=new Thread(ticketsTongbuThree,"2");
        Thread threadThree=new Thread(ticketsTongbuThree,"3");
        threadOne.start();threadTwo.start();threadThree.start();


        System.out.println("___________________");

    }


}