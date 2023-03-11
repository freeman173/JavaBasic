package com.jc.twelve.demo5;

public class DemoTest {

    public static void main(String[] CC) throws CloneNotSupportedException {

/*
        new方法：
            a、b的地址一致；
            c跟a、b的地址不一致；
*/
        Person a=new Person();
        Person b=a;
        Person c=new Person();

//      clone方法实现浅克隆
        Person d=  a.clone_qian();

//      clone方法实现深克隆
        Person e=  a.clone_shen();

        System.out.println("_________________");


    }
}
