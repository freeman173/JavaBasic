package com.jc.thirteenDay;

import org.junit.Test;

/*

异常的处理-抛抓模型：
    抛：程序执行时若遇到异常，在异常代码处生成一个对应异常类的对象并抛出，try块后面的代码不再执行。

    抓：有两种抓法
        A:try...catch...finally

        B:
           throws：程序执行时若遇到异常，在异常代码处生成一个对应异常类的对象并抛出将
       异常抛给其上层调用者（上层调用者最终还是得用try--catch结构来处理它），后续代码不再执行。

        具体使用方法：throws+异常类型 写在方法声明处：指明可能抛出的异常类型。







*/
public class ExceptionTest1 {

    /*
        try-catch-finally 的案例:
             若有多个catch结构：捕捉到异常后，直接进入对应的一个catch结构进行处理，处理完后
         就直接退出try-catch-finally结构。
             若try或者catch有return语句，return的“返回操作”会先暂时压入到栈区不做其他操作，等finally执行完后
         再回来执行“返回操作”。（若finally中有返回语句，则直接就提前返回了！）


    */
    public static String  test1(){

        String str="123";
        str="abc";
        try {
            int num=Integer.parseInt(str);
            System.out.println("暂无异常");
        }catch (NumberFormatException e){
            System.out.println("出现了数值转换异常，别着急！");
            e.printStackTrace();
            return "catch";
        }finally {

            System.out.println("finally语句肯定会被执行！");
            return "finally";
//
        }
//        return "";
//        System.out.println("我是案例的结束");
//        System.out.println("_____________");
    }











    public static void main(String[] jc){
        System.out.println(""+test1());
        System.out.println("______________");

    }


}
