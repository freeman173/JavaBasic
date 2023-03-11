package com.jc.xiancheng;


/*
@author 蒋超
@since version-1.0
@date 2023/2/10 21:29
@description ：
    多线程的第一种使用方式————继承于Thread类：
                1、创建一个继承于Thread的子类；
                2、重写Thread.run();
                3、实例化对象并调用start();
    注：start()的作用:启动当前线程并调用run()方法；不可直接调用run方法，否则会得到串行执行程序的效果。

    Thread类中常用的几个方法：
           currentThread():返回当前执行代码的线程。
           yield():释放当前cpu的执行权
           join()：在a中调用b.join(),a进入阻塞。等到b执行完后，a才结束阻塞。
           isAlive():当前线程是否存活。
           set/getPriority():设置/获取优先级。（优先级越高，被执行的概率就越高.）

*/

//1、
class MyThreadOne extends Thread{
//    2、
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            if(i%2==0) System.out.println(i);
        }
    }
}


/*
@author 蒋超
@since version-1.0
@date : 22:15
@description :
        初步写一个多线程卖票：
            有一个bug：两个窗口同时卖出了同一张票！

*/
class Tickets extends Thread{
    private static int ticketNum=100;

    @Override
    public void run() {
        while(true){
            if(ticketNum>0){
                System.out.println(getName()+"卖票："+ticketNum);
                ticketNum--;
            }else break;
        }

    }
}



public class Demo1 {

    public static void main(String[] jc){
        //    3、
//        MyThreadOne myThreadOne=new MyThreadOne();
//        myThreadOne.setName("我是超人");
//        myThreadOne.start();
//
//        for(int i=0;i<10000;i++){
//            if(i%2!=0) System.out.println(i);
//        }
        Tickets ticket1=new Tickets();
        ticket1.setName("窗口1");
        Tickets ticket2=new Tickets();
        ticket2.setName("窗口2");
        Tickets ticket3=new Tickets();
        ticket3.setName("窗口3");
        ticket1.start();ticket2.start();ticket3.start();

        System.out.println("___________");


    }



}


