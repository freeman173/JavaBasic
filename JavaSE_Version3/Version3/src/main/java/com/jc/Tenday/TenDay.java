package com.jc.Tenday;

import com.jc.Tenday.demo.Man;
import com.jc.Tenday.demo.Person;
import com.jc.Tenday.demo.WoMan;

public class TenDay {

    public static void main(String[] jc){

        /*
            ���ⷽ�����ã�������ͬ��ͬ��������ʱ��ʵ����ִ��������д����ķ�����
         */
        Person p1=new Man();
        p1.eat();

        Person p2=new WoMan();
        p2.eat();


    /*
        ����ת�ͣ�ָ���������ĸ������ø����������á������ܵ��������ж��еķ�����

            instanceof:
                a instanceof A:�ж϶���a�Ƿ�����A��ʵ����(������ת��֮ǰ��Ҫ������һ���жϡ�)
     */

        Object result=p1 instanceof Person;
        Man m1=(Man)p1;
        m1.earnMoney();

        System.out.println("________________");

    }

}
