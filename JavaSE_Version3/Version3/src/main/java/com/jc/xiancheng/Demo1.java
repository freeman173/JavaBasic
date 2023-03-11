package com.jc.xiancheng;


/*
@author ����
@since version-1.0
@date 2023/2/10 21:29
@description ��
    ���̵߳ĵ�һ��ʹ�÷�ʽ���������̳���Thread�ࣺ
                1������һ���̳���Thread�����ࣻ
                2����дThread.run();
                3��ʵ�������󲢵���start();
    ע��start()������:������ǰ�̲߳�����run()����������ֱ�ӵ���run�����������õ�����ִ�г����Ч����

    Thread���г��õļ���������
           currentThread():���ص�ǰִ�д�����̡߳�
           yield():�ͷŵ�ǰcpu��ִ��Ȩ
           join()����a�е���b.join(),a�����������ȵ�bִ�����a�Ž���������
           isAlive():��ǰ�߳��Ƿ��
           set/getPriority():����/��ȡ���ȼ��������ȼ�Խ�ߣ���ִ�еĸ��ʾ�Խ��.��

*/

//1��
class MyThreadOne extends Thread{
//    2��
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            if(i%2==0) System.out.println(i);
        }
    }
}


/*
@author ����
@since version-1.0
@date : 22:15
@description :
        ����дһ�����߳���Ʊ��
            ��һ��bug����������ͬʱ������ͬһ��Ʊ��

*/
class Tickets extends Thread{
    private static int ticketNum=100;

    @Override
    public void run() {
        while(true){
            if(ticketNum>0){
                System.out.println(getName()+"��Ʊ��"+ticketNum);
                ticketNum--;
            }else break;
        }

    }
}



public class Demo1 {

    public static void main(String[] jc){
        //    3��
//        MyThreadOne myThreadOne=new MyThreadOne();
//        myThreadOne.setName("���ǳ���");
//        myThreadOne.start();
//
//        for(int i=0;i<10000;i++){
//            if(i%2!=0) System.out.println(i);
//        }
        Tickets ticket1=new Tickets();
        ticket1.setName("����1");
        Tickets ticket2=new Tickets();
        ticket2.setName("����2");
        Tickets ticket3=new Tickets();
        ticket3.setName("����3");
        ticket1.start();ticket2.start();ticket3.start();

        System.out.println("___________");


    }



}


