package com.jc.twelve.demo3;

interface Father{
    default void help(){
        System.out.println("���������");
    }
    static void jt(){
        System.out.println("���Ǹ��ྲ̬");
    }
}
interface Mother{
    default void help(){
        System.out.println("�������裡");
    }
}
class Tcx{
    public void help(){
        System.out.println("������Ů����");
    }
}

public class InterfaceTestthree extends Tcx implements Father,Mother{
    public void help(){
        System.out.println("�����Ǹ��أ�");
/*
���ø���ķ��������ӿڵ�Ĭ�Ϸ���
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




