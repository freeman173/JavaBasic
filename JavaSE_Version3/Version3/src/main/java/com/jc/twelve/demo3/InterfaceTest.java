package com.jc.twelve.demo3;

/*

接口定义的元素：
    java7：
        全局常量
        抽象方法
    java8：
        静态方法
        默认方法:默认使用这个方法，跟访问权限符“default”得区分开。


 */
interface Flyable{
    /*
        全局常量：以下两种写法等价
    */
    public static final int Max_Speed=7900;
    int Min_Speed=1;

//    抽象方法
    public abstract void fly();
    void stop();


//    默认方法:
     default void moren(){
        System.out.println("我是默认方法！");
    }


//    静态方法
    static void jingtai(){
        System.out.println("我是静态方法！");
    }


}


public class InterfaceTest {

    public static void main(String[] JC){
        System.out.println(Flyable.Max_Speed);
        System.out.println(Flyable.Min_Speed);
        Flyable.jingtai();
        System.out.println("___________");
    }


}
