package com.jc.zhujie;
/*
JDK内置的三个基本注解：
    @Override：
    @Deprecated：
    @SupressWarnings：


元注解：对一般注解做一个修饰说明。
    @Target:用于指定注解修饰什么结构
    @Retention:注解的生命周期
    @Documented：被javadoc解析时，保留下来
    @Inherited:注解具有被继承性



*/


import java.lang.annotation.*;


/*
        自定义一个注解
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