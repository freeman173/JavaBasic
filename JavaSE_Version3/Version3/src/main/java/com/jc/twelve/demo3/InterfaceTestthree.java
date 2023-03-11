package com.jc.twelve.demo3;

interface Father{
    default void help(){
        System.out.println("我是你爹！");
    }
    static void jt(){
        System.out.println("我是父类静态");
    }
}
interface Mother{
    default void help(){
        System.out.println("我是你妈！");
    }
}
class Tcx{
    public void help(){
        System.out.println("我是你女朋友");
    }
}

public class InterfaceTestthree extends Tcx implements Father,Mother{
    public void help(){
        System.out.println("调用那个呢：");
/*
调用父类的方法、父接口的默认方法
*/
        super.help();
        Mother.super.help();
        Father.super.help();
//        Father.jt();

    }

    public static void main(String[] jc){
        new InterfaceTestthree().help();
        System.out.println("__________");

    }

}




