package com.jc.twelve.demo5;

public class DemoTest {

    public static void main(String[] CC) throws CloneNotSupportedException {

/*
        new������
            a��b�ĵ�ַһ�£�
            c��a��b�ĵ�ַ��һ�£�
*/
        Person a=new Person();
        Person b=a;
        Person c=new Person();

//      clone����ʵ��ǳ��¡
        Person d=  a.clone_qian();

//      clone����ʵ�����¡
        Person e=  a.clone_shen();

        System.out.println("_________________");


    }
}
