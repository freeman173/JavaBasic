package com.jc.xiancheng;
/*
@author ����
@since version-1.0
@date 2023/2/15 20:57
@description ��

    �������������Ʒ�󽫲�Ʒ������Ա�������ߴӵ�Աȡ�߲�Ʒ����Աһ��ֻ�ܳ��й̶������Ĳ�Ʒ��
������
    1�����߳����⣺�����߳��������߳�
    2���������ݣ���Ʒ
    3���漰�߳�ͨ������

�ĵã�
    wait()��notify()����Եģ��еȴ��͵��л��ѡ�
    �����ͬ�������÷ǳ��һ����ͬʱ��ס���δ��룬�����δ���Ϊһ��ͬ������һ��ֻ����һ���̷߳��ʣ�

*/

import lombok.Getter;

@Getter
class Clerk{
    private int bag;

/*
�������������ѷ�������һ��ͬ������



*/
    public synchronized void produce() {
        if (bag<20){
        bag++;
        System.out.println(Thread.currentThread().getName()+"��ʼ������"+bag+"�Ų�Ʒ:");
        System.out.println("Ŀǰ���:"+getBag()+"��");
        notify();//�϶��в�Ʒ�ˣ���������������
        }else {
            try {
                wait();//���������Ѵﵽ����һ��
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void consumer() {
        if(bag>0){
        System.out.println(Thread.currentThread().getName()+"��ʼ���ѵ�"+bag+"�Ų�Ʒ:");
        bag--;
        System.out.println("Ŀǰ���:"+getBag()+"��");
        notify();//�϶��п�λ�ˣ���������������
    }else {
            try {
                wait();//û��Ʒ�ˣ���һ��
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
//       �������������߹����������
        Clerk clerk=new Clerk();

        Producer p1=new Producer(clerk);
        Thread t1=new Thread(p1,"������1");

        Consumer c1=new Consumer(clerk);
        Thread t2=new Thread(c1,"������1");
        Consumer c2=new Consumer(clerk);
        Thread t3=new Thread(c2,"������2");
        t3.setPriority(10);
        t1.start();t2.start();t3.start();

        }



}