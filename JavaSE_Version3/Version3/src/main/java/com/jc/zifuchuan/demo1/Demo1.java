package com.jc.zifuchuan.demo1;


import java.nio.charset.StandardCharsets;

/*
@author ����
@since version-1.0
@date 2023/2/19 21:35
@description :




*/
public class Demo1 {

    /*
    @author ����
    @since version-1.0
    @date 2023/2/19 21:36
    @param
    @return
    @description :
    �ַ�����ƴ�Ӳ�����
        �����볣����ƴ�ӽ���ڳ����أ�
        ֻҪ��һ��������������ڶ��У���ƴ�ӵĽ��������intern���������ؽ�����ڳ������У���

    */

    public static void One(){
        String s1="hello";
        String s2="world";

        String s3="hello"+"world";

        String s4=s1+s2;
        String s5=(s1+s2).intern();

        Integer integer=1;

        System.out.println("___________");

    }


  /*
    @author ����
    @since version-1.0
    @date 2023/2/19 21:36
    @param
    @return
    @description :
    �ַ���ת��Ϊbyte���飺
        �ֽ���������ڴ洢�ֽ���������ֵ�����Ա���-128��127��ֵ��
            ���Խ��ַ���ת��Ϊ��Ӧ��ascii�������顣

    */
    public static void Two(){

        String str1="abc123����";
        byte[] bytes=str1.getBytes();



        System.out.println("___________");

    }




    public static void main(String[] DD){
        Two();
    }
}