package com.jc.zhujie;
/*
JDK���õ���������ע�⣺
    @Override��
    @Deprecated��
    @SupressWarnings��


Ԫע�⣺��һ��ע����һ������˵����
    @Target:����ָ��ע������ʲô�ṹ
    @Retention:ע�����������
    @Documented����javadoc����ʱ����������
    @Inherited:ע����б��̳���



*/


import java.lang.annotation.*;


/*
        �Զ���һ��ע��
    */
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@Inherited
@interface Myannotation{

}


public class Demo1 {


    @Myannotation
    public static void One(){
        System.out.println("_____________");
    }

    public static void main(String[] D){

    }




}