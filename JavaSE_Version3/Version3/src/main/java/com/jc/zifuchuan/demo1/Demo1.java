package com.jc.zifuchuan.demo1;


import java.nio.charset.StandardCharsets;

/*
@author 蒋超
@since version-1.0
@date 2023/2/19 21:35
@description :




*/
public class Demo1 {

    /*
    @author 蒋超
    @since version-1.0
    @date 2023/2/19 21:36
    @param
    @return
    @description :
    字符串的拼接操作：
        常量与常量的拼接结果在常量池；
        只要有一个变量，结果就在堆中（若拼接的结果调用了intern方法，返回结果就在常量池中）；

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
    @author 蒋超
    @since version-1.0
    @date 2023/2/19 21:36
    @param
    @return
    @description :
    字符串转化为byte数组：
        字节数组仅用于存储字节数据类型值，可以保存-128到127的值。
            可以将字符串转换为对应的ascii编码数组。

    */
    public static void Two(){

        String str1="abc123蒋超";
        byte[] bytes=str1.getBytes();



        System.out.println("___________");

    }




    public static void main(String[] DD){
        Two();
    }
}