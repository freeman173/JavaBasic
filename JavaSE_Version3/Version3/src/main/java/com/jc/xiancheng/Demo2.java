package com.jc.xiancheng;


/*
@author ����
@since version-1.0
@date 2023/2/11 20:25
@description :
        ͨ��ʵ��runnable�ӿ���ʵ�ֶ��̣߳�
            1������һ��ʵ����runnable�ӿڵ���
            2��ʵ�ֽӿ��е�run����
            3��ʵ�����ö��󲢽��ö�����Ϊ�������ݵ�Thread��Ĺ������У�����һ��Thread�Ķ��󣻵���start��������

         ע���Ƽ�ʹ�����ַ�ʽ��������ͬһ��ʵ�ֶ��󱻶���̶߳���ʹ�ã�

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
        Thread t1=new Thread(myThreadTwo,"����");
        t1.start();


    }
}