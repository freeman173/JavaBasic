package com.jc.zifuchuan.demo1;


/*
@author ����
@since version-1.0
@date 2023/2/20 21:22
@description:
    String ��StringBuffer��StringBuilder����ͬ��
  String:���ɱ���ַ����У�
  StringBuffer���ɱ���ַ����У��̰߳�ȫ��Ч�ʵͣ�
  StringBuilder���ɱ���ַ����У��̲߳���ȫ��Ч�ʸߣ�

  String�����Ķ�����������޸Ļ����һ���µĶ���
��StringBuffer��StringBuilder���Ƕ���������޸ģ���������µĶ���




*/
public class Demo2 {


    /*
    @author ����
    @since version-1.0
    @date 2023/2/20 21:38
    @param
    @return
    @description:
        ����Ч����һ���Աȣ�
            StringBuilder>StringBuffer>String

    */
    public static void One(){
        String string=new String("");
        StringBuffer stringBuffer=new StringBuffer("");
        StringBuilder stringBuilder=new StringBuilder("");

        long startTime = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            string=string+i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);


        startTime = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            stringBuffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);


        startTime = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            stringBuilder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);


        System.out.println("__________");


    }







    public static void main(String[] DD){
        One();
        System.out.println("__________________");


    }
}