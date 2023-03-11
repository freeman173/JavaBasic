package com.jc.xiancheng;

/*
线程通信实例：使用两个线程打印1-100，交替打印。
需要用到的方法：
    wait():一旦执行此方法，当前线程进入阻塞并释放同步锁。
    notify():唤醒被wait的仅一个线程（优先级高的优先）。
    notifyall():唤醒所有被wait的线程。
注：这三个方法必须在代码的同步区域;这三个方法必须由同步锁对象调用。

*/

class CountNumber implements Runnable{

    private int number=0;

    private Object object=new Object();//同步锁

    @Override
    public void run() {
        while(true){
            synchronized (object){
            object.notify();//唤醒所有的等待线程
            number++;
            if(number>100) break;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"打印数字："+(number));
                try {
                    object.wait();//执行完功能后，就进入阻塞状态等待唤醒。
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

public class Demo6 {

    public static void main(String[] D){
        CountNumber countNumber=new CountNumber();
        Thread thread1=new Thread(countNumber,"线程1");
        Thread thread2=new Thread(countNumber,"线程2");
        thread1.start();thread2.start();


    }


}