package com.jc.thirteenDay;

import org.junit.Test;

/*

�쳣�Ĵ���-��ץģ�ͣ�
    �ף�����ִ��ʱ�������쳣�����쳣���봦����һ����Ӧ�쳣��Ķ����׳���try�����Ĵ��벻��ִ�С�

    ץ��������ץ��
        A:try...catch...finally

        B:
           throws������ִ��ʱ�������쳣�����쳣���봦����һ����Ӧ�쳣��Ķ����׳���
       �쳣�׸����ϲ�����ߣ��ϲ���������ջ��ǵ���try--catch�ṹ�������������������벻��ִ�С�

        ����ʹ�÷�����throws+�쳣���� д�ڷ�����������ָ�������׳����쳣���͡�







*/
public class ExceptionTest1 {

    /*
        try-catch-finally �İ���:
             ���ж��catch�ṹ����׽���쳣��ֱ�ӽ����Ӧ��һ��catch�ṹ���д����������
         ��ֱ���˳�try-catch-finally�ṹ��
             ��try����catch��return��䣬return�ġ����ز�����������ʱѹ�뵽ջ������������������finallyִ�����
         �ٻ���ִ�С����ز�����������finally���з�����䣬��ֱ�Ӿ���ǰ�����ˣ���


    */
    public static String  test1(){

        String str="123";
        str="abc";
        try {
            int num=Integer.parseInt(str);
            System.out.println("�����쳣");
        }catch (NumberFormatException e){
            System.out.println("��������ֵת���쳣�����ż���");
            e.printStackTrace();
            return "catch";
        }finally {

            System.out.println("finally���϶��ᱻִ�У�");
            return "finally";
//
        }
//        return "";
//        System.out.println("���ǰ����Ľ���");
//        System.out.println("_____________");
    }











    public static void main(String[] jc){
        System.out.println(""+test1());
        System.out.println("______________");

    }


}
