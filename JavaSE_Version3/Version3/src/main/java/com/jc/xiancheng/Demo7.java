package com.jc.xiancheng;
/*
@author 蒋超
@since version-1.0
@date 2023/2/15 20:57
@description ：

    生产者制造出产品后将产品交给店员，消费者从店员取走产品，店员一次只能持有固定数量的产品。
分析：
    1、多线程问题：消费线程与生产线程
    2、共享数据：产品
    3、涉及线程通信问题

心得：
    wait()与notify()是配对的：有等待就得有唤醒。
    这里的同步锁运用非常妙：一个锁同时锁住两段代码，这两段代码为一个同步区域（一次只允许一个线程访问）

*/

import lombok.Getter;

@Getter
class Clerk{
    private int bag;

/*
生产方法与消费方法公用一个同步锁：



*/
    public synchronized void produce() {
        if (bag<20){
        bag++;
        System.out.println(Thread.currentThread().getName()+"开始生产第"+bag+"号产品:");
        System.out.println("目前库存:"+getBag()+"件");
        notify();//肯定有产品了，提醒消费者消费
        }else {
            try {
                wait();//生产数量已达到，等一会
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void consumer() {
        if(bag>0){
        System.out.println(Thread.currentThread().getName()+"开始消费第"+bag+"号产品:");
        bag--;
        System.out.println("目前库存:"+getBag()+"件");
        notify();//肯定有空位了，提醒生产者生产
    }else {
            try {
                wait();//没产品了，等一会
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable{
    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produce();
        }
    }
}

class Consumer implements Runnable{
    private Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk=clerk;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumer();
        }
    }

}




public class Demo7 {
    static int count=0;
    public static void main(String[] D){
//       消费者与生产者共用这个对象
        Clerk clerk=new Clerk();

        Producer p1=new Producer(clerk);
        Thread t1=new Thread(p1,"生产者1");

        Consumer c1=new Consumer(clerk);
        Thread t2=new Thread(c1,"消费者1");
        Consumer c2=new Consumer(clerk);
        Thread t3=new Thread(c2,"消费者2");
        t3.setPriority(10);
        t1.start();t2.start();t3.start();

        }



}