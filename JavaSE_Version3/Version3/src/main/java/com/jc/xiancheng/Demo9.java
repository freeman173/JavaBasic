package com.jc.xiancheng;

/*
@author 蒋超
@since version-1.0
@date 2023/2/16 21:09
@description :
    线程池：提前创建好多个线程放入线程池，用的时候直接拿，用完后放入线程池。

    两个相关api：
        Executors:
            工具类，用于创建不同类型的线程池。
        ExecutorService:
            线程池接口

    创建好线程池之后，直接把runnable/callable的接口实现类丢进去就行！



*/
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo9 {
    public static void main(String[] DD){
        ExecutorService executorService= Executors.newFixedThreadPool(10);

//        MyThreadTwo myThreadTwo=new MyThreadTwo();//runnable接口
//        ThreadCallable threadCallable=new ThreadCallable();//callable接口

//        TicketsTongbuThree ticketsTongbuThree=new TicketsTongbuThree();
//        Thread threadOne=new Thread(ticketsTongbuThree,"1");
//        Thread threadTwo=new Thread(ticketsTongbuThree,"2");
        TicketsTongbuFour tongbuFour1=new TicketsTongbuFour();
        TicketsTongbuFour tongbuFour2=new TicketsTongbuFour();

        executorService.submit(tongbuFour1);
        executorService.submit(tongbuFour2);

//        关闭线程池
        executorService.shutdown();





    }



}