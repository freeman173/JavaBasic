package com.jc.xiancheng;

/*
�߳�ͨ��ʵ����ʹ�������̴߳�ӡ1-100�������ӡ��
��Ҫ�õ��ķ�����
    wait():һ��ִ�д˷�������ǰ�߳̽����������ͷ�ͬ������
    notify():���ѱ�wait�Ľ�һ���̣߳����ȼ��ߵ����ȣ���
    notifyall():�������б�wait���̡߳�
ע�����������������ڴ����ͬ������;����������������ͬ����������á�

*/

class CountNumber implements Runnable{

    private int number=0;

    private Object object=new Object();//ͬ����

    @Override
    public void run() {
        while(true){
            synchronized (object){
            object.notify();//�������еĵȴ��߳�
            number++;
            if(number>100) break;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"��ӡ���֣�"+(number));
                try {
                    object.wait();//ִ���깦�ܺ󣬾ͽ�������״̬�ȴ����ѡ�
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
        Thread thread1=new Thread(countNumber,"�߳�1");
        Thread thread2=new Thread(countNumber,"�߳�2");
        thread1.start();thread2.start();


    }


}