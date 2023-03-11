package com.jc.xiancheng;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
@author 蒋超
@since version-1.0
@date 2023/2/16 20:47
@description :
    实现线程的第3种方式：
        使用callable接口:
               相比于runnable()更强大：
                    可以有泛型的返回值；需要借助FutureTask类；允许抛出异常，可以获取异常信息。

        注：futuretask类不太了解其原理，后面有需要再来了解！



*/
class ThreadCallable implements Callable {

    @Override
    public Object call() throws Exception {
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
                sum+=i;
            }
        }
        return sum;
    }
}

public class Demo8 {
    public static void main(String[] D){

        ThreadCallable threadCallable=new ThreadCallable();
        FutureTask futureTask=new FutureTask(threadCallable);
        Thread thread=new Thread(futureTask);


        thread.start();

        System.out.println("______________________");

    }

}