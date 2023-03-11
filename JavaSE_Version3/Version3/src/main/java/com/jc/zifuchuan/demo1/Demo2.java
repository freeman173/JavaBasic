package com.jc.zifuchuan.demo1;


/*
@author 蒋超
@since version-1.0
@date 2023/2/20 21:22
@description:
    String 、StringBuffer、StringBuilder的异同？
  String:不可变的字符序列；
  StringBuffer：可变的字符序列；线程安全但效率低；
  StringBuilder：可变的字符序列；线程不安全但效率高；

  String声明的对象进行内容修改会产生一个新的对象，
而StringBuffer、StringBuilder则是对自身进行修改，不会产生新的对象；




*/
public class Demo2 {


    /*
    @author 蒋超
    @since version-1.0
    @date 2023/2/20 21:38
    @param
    @return
    @description:
        三者效率做一个对比！
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