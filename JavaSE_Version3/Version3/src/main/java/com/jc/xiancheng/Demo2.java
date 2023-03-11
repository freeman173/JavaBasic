package com.jc.xiancheng;


/*
@author 蒋超
@since version-1.0
@date 2023/2/11 20:25
@description :
        通过实现runnable接口来实现多线程：
            1、创建一个实现了runnable接口的类
            2、实现接口中的run方法
            3、实例化该对象并将该对象作为参数传递到Thread类的构造器中，创建一个Thread的对象；调用start（）方法

         注：推荐使用这种方式，可以让同一个实现对象被多个线程对象使用！

*/
class MyThreadTwo implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=100;i++){
            if(i%2==0){

                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }

    }
}


public class Demo2 {
    public static void main(String[] JC){
        MyThreadTwo myThreadTwo=new MyThreadTwo();
        Thread t1=new Thread(myThreadTwo,"蒋超");
        t1.start();


    }
}