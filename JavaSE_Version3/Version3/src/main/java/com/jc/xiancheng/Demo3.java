package com.jc.xiancheng;


/*
@author 蒋超
@since version-1.0
@date 2023/2/12 20:58
@description :
    同步解决买票问题:
        线程访问票的数量这个变量时，必须互斥：
                使用同步代码块：
                    synchronized（同步监视器）{//同步监视器可以为一个任意对象，但必须得是同一个！
                        同步代码：操作共享数据的代码
                    }

*/
class TicketsTongbuOne extends Thread{
    private static int ticketNum=100;

    @Override
    public void run() {
        while(true) {
            synchronized (Object.class) {//加锁：一次只允许一个线程进入
                if (ticketNum > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "卖票：" + ticketNum);
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
                System.out.println(Thread.currentThread().getName()+"卖票："+ticketNum);
                ticketNum--;
            }else break;
        }
        }
    }
}

/*
@author 蒋超
@since version-1.0
@date 2023/2/12 20:58
@description :
    同步解决买票问题:
        线程访问票的数量这个变量时，必须互斥：
                使用同步方法：
                    同步方法也有同步锁：
                        非静态：this
                        静态：当前类


*/

class TicketsTongbuThree implements Runnable{
    private static int ticketNum=100;

    @Override
    public void run() {
        while(true){
                if(show()==false) break;
            }
    }

    private synchronized boolean show(){//同步监视器默认为"this"
        if(ticketNum>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"卖票："+ticketNum);
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
    private static synchronized boolean show(){//同步锁为.class对象
        if (ticketNum > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票：" + ticketNum);
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