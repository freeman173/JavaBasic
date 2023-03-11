package com.jc.twelve.demo3;


/*
一个经典面试题

*/

//一个接口
interface A{
//    接口定义的变量为静态变量
     String x="我是接口";
}

//一个类
class B{
//   这里定义为实例变量
     String x="我是父类";
}

//继承类
class C extends B implements A{
    public void px(){
//        访问时必须指定前缀对象
//        System.out.println(x);
        System.out.println(A.x);
        System.out.println(super.x);
    }

}




public class InterfaceTestwo {

    public static void main(String[] jc){
        new C().px();
        System.out.println("_________________");

    }




}
