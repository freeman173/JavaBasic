package com.jc.jihe;

/*
lamda表达式:
基本语法: (parameters) -> expression 或 (parameters) ->{ statements; }

->：可理解为“被用于”的意思。


函数式接口：
    一个接口有且只有一个抽象方法





*/

//无返回值无参数
@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}

//无返回值两个参数
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a,int b);
}

//有返回值且两个参数
@FunctionalInterface
interface MoreParameterReturn {
    int test(int a,int b);
}

public class Demo {


    public static void One(){

       NoParameterNoReturn noReturn=()->{
           System.out.println("我是超人！");
       };
        noReturn.test();

       MoreParameterNoReturn moreParameterNoReturn=(int a,int b)->{
            System.out.println("jc:"+(a+b));
        };

        moreParameterNoReturn.test(12,20);


        MoreParameterReturn moreParameterReturn=(int a,int b)->{
            return a+b;
        };

        moreParameterReturn.test(12,20);

        System.out.println("______________");



    }

    public static void main(String[] DD){
        One();

    }



}