package com.jc.fanshe.demo3;

/*
��̬������2��
*/

public class Demo3 {

    public static void main(String[] D){
        ServiceImpl service=new ServiceImpl();

        ServiceImplStaticProxy serviceImplStaticProxy=new ServiceImplStaticProxy(service);
        serviceImplStaticProxy.add();
        System.out.println("____________");

    }

}