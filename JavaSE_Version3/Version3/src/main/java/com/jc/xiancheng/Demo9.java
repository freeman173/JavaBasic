package com.jc.xiancheng;

/*
@author ����
@since version-1.0
@date 2023/2/16 21:09
@description :
    �̳߳أ���ǰ�����ö���̷߳����̳߳أ��õ�ʱ��ֱ���ã����������̳߳ء�

    �������api��
        Executors:
            �����࣬���ڴ�����ͬ���͵��̳߳ء�
        ExecutorService:
            �̳߳ؽӿ�

    �������̳߳�֮��ֱ�Ӱ�runnable/callable�Ľӿ�ʵ���ඪ��ȥ���У�



*/
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo9 {
    public static void main(String[] DD){
        ExecutorService executorService= Executors.newFixedThreadPool(10);

//        MyThreadTwo myThreadTwo=new MyThreadTwo();//runnable�ӿ�
//        ThreadCallable threadCallable=new ThreadCallable();//callable�ӿ�

//        TicketsTongbuThree ticketsTongbuThree=new TicketsTongbuThree();
//        Thread threadOne=new Thread(ticketsTongbuThree,"1");
//        Thread threadTwo=new Thread(ticketsTongbuThree,"2");
        TicketsTongbuFour tongbuFour1=new TicketsTongbuFour();
        TicketsTongbuFour tongbuFour2=new TicketsTongbuFour();

        executorService.submit(tongbuFour1);
        executorService.submit(tongbuFour2);

//        �ر��̳߳�
        executorService.shutdown();





    }



}