package com.jc.fanshe.demo3;

/*
¾²Ì¬´úÀí°¸Àý2£º
*/

public class Demo3 {

    public static void main(String[] D){
        ServiceImpl service=new ServiceImpl();

        ServiceImplStaticProxy serviceImplStaticProxy=new ServiceImplStaticProxy(service);
        serviceImplStaticProxy.add();
        System.out.println("____________");

    }

}