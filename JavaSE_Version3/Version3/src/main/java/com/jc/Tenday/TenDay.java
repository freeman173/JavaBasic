package com.jc.Tenday;

import com.jc.Tenday.demo.Man;
import com.jc.Tenday.demo.Person;
import com.jc.Tenday.demo.WoMan;

public class TenDay {

    public static void main(String[] jc){

        /*
            虚拟方法调用：当调用同名同参数方法时，实际上执行子类重写父类的方法。
         */
        Person p1=new Man();
        p1.eat();

        Person p2=new WoMan();
        p2.eat();


    /*
        向下转型：指向子类对象的父类引用赋给子类引用。父类能调用子类中独有的方法。

            instanceof:
                a instanceof A:判断对象a是否是类A的实例。(在向下转型之前需要做这样一个判断。)
     */

        Object result=p1 instanceof Person;
        Man m1=(Man)p1;
        m1.earnMoney();

        System.out.println("________________");

    }

}
