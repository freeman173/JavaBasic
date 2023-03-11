package com.jc.fanshe.demo4;
/*

��̬����
    ��Ҫʵ�ֵĹ��ܣ�
        ���ݼ��ص��ڴ��еı������࣬��̬�ش���һ�������༰�����
        ��ͨ�������������÷���ʱ����ζ�̬��ȥ���ñ��������е�ͬ��������

*/

import lombok.Setter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/*
����һ��������ĵ��ô������ÿ��������ĵ��ô�����򶼱���ʵ��InvocationHandler�ӿ�
*/

class WorkHandler implements InvocationHandler{

//    ���������ʵ����
    private Object object;
    public WorkHandler(Object object) {
        this.object = object;
    }

    /*


        �����������壺
            proxy��������ʵ��
            method�����÷�����class����
            args�����÷����Ĳ���
    */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        pre();
        Object o=method.invoke(object,args);//���ñ�������ķ���������ֵ
        after();
        return o;
    }


    public static void pre(){
        System.out.println("��̬�������ǰ���Ӳ�����");
    }
    public static void after(){
        System.out.println("��̬�������β���Ӳ�����");
    }


}


//����ӹ���
class dynamicProxyFactory{

    public static Object getInstance(Object obj){

        WorkHandler workHandler=new WorkHandler(obj);//��������Ķ���Ž�ȥ

        /*
            �������������ĺ��壺
                ���ĸ�classloader��������ɵĴ�������м��أ�
                �����ǵĴ�������ṩһ��ʲô���Ľӿڣ�
                ��̬���������÷�����ʱ����������һ��InvocationHandler����
        */
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),workHandler);


    }


}


public class Demo4{

    public static void main(String[] D){
//        ���ɱ�������ʵ��
        SuperMan superMan=new SuperMan();

//        �õ�������ʵ��
        Human humanDynamicProxy= (Human) dynamicProxyFactory.getInstance(superMan);
//        ���÷���ʱ���Զ����� InvocationHandler.invoke(Object proxy, Method method, Object[] args)
        humanDynamicProxy.eat("������","ƻ��");

        System.out.println("___________");


    }

}







