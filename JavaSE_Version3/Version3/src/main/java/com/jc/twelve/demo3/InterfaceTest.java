package com.jc.twelve.demo3;

/*

�ӿڶ����Ԫ�أ�
    java7��
        ȫ�ֳ���
        ���󷽷�
    java8��
        ��̬����
        Ĭ�Ϸ���:Ĭ��ʹ�����������������Ȩ�޷���default�������ֿ���


 */
interface Flyable{
    /*
        ȫ�ֳ�������������д���ȼ�
    */
    public static final int Max_Speed=7900;
    int Min_Speed=1;

//    ���󷽷�
    public abstract void fly();
    void stop();


//    Ĭ�Ϸ���:
     default void moren(){
        System.out.println("����Ĭ�Ϸ�����");
    }


//    ��̬����
    static void jingtai(){
        System.out.println("���Ǿ�̬������");
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
