package com.jc.xiancheng;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
@author ����
@since version-1.0
@date 2023/2/16 20:47
@description :
    ʵ���̵߳ĵ�3�ַ�ʽ��
        ʹ��callable�ӿ�:
               �����runnable()��ǿ��
                    �����з��͵ķ���ֵ����Ҫ����FutureTask�ࣻ�����׳��쳣�����Ի�ȡ�쳣��Ϣ��

        ע��futuretask�಻̫�˽���ԭ����������Ҫ�����˽⣡



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