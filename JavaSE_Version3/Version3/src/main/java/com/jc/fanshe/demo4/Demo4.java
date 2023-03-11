package com.jc.fanshe.demo4;
/*

动态代理：
    需要实现的功能：
        根据加载到内存中的被代理类，动态地创建一个代理类及其对象。
        当通过代理类对象调用方法时，如何动态地去调用被代理类中的同名方法。

*/

import lombok.Setter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/*
定义一个代理类的调用处理程序，每个代理类的调用处理程序都必须实现InvocationHandler接口
*/

class WorkHandler implements InvocationHandler{

//    代理类的真实对象
    private Object object;
    public WorkHandler(Object object) {
        this.object = object;
    }

    /*


        三个参数含义：
            proxy：代理类实例
            method：调用方法的class对象
            args：调用方法的参数
    */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        pre();
        Object o=method.invoke(object,args);//调用被代理类的方法并返回值
        after();
        return o;
    }


    public static void pre(){
        System.out.println("动态代理的提前附加操作！");
    }
    public static void after(){
        System.out.println("动态代理的收尾附加操作！");
    }


}


//代理加工厂
class dynamicProxyFactory{

    public static Object getInstance(Object obj){

        WorkHandler workHandler=new WorkHandler(obj);//将被代理的对象放进去

        /*
            这里三个参数的含义：
                由哪个classloader对象对生成的代理类进行加载；
                给我们的代理对象提供一组什么样的接口；
                动态代理对象调用方法的时候会关联到哪一个InvocationHandler对象；
        */
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),workHandler);


    }


}


public class Demo4{

    public static void main(String[] D){
//        生成被代理类实例
        SuperMan superMan=new SuperMan();

//        得到代理类实例
        Human humanDynamicProxy= (Human) dynamicProxyFactory.getInstance(superMan);
//        调用方法时：自动来到 InvocationHandler.invoke(Object proxy, Method method, Object[] args)
        humanDynamicProxy.eat("西红柿","苹果");

        System.out.println("___________");


    }

}







