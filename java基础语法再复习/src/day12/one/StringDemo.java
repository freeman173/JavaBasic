package day12.one;

/*
1、
字符串是常量,它的值在创建之后不能更改，如果引用对象被赋予了新的字符串值（常量区会在创建一个常量区存放该字符串），那么引用对象的值也就改变了。
见图解


2、
String s = new String(“hello”)和String s = “hello”的区别:
    见图解
    String s = new String(“hello”)：
        先在堆空间中new一个对象，然后再到常量区中找寻指定的“hello”字符串常量，找到之后返回其地址给堆中的对象

    String s = “hello”：
        直接在常量区中找寻指定的“hello”值并返回其地址


3、
==:比较引用类型，比较的是地址值
equal():默认比较的是地址值。String类重写了equals()方法，该方法的作用是比较字符串的内容是否相同


4、
字符串相加时如果含有字符串变量，则先在堆中开空间，再拼接；前后的引用值不一样。

字符串相加时不含字符串变量，是先加，然后在常量池找，如果有就直接返回，否则，就在常量池中创建一个字符串常量；前后的引用值一样。




5、在这里延伸出一个重点：java中的引用与值之间的区别

A a1 = new A();
它代表A是类，a1是引用不是对象，new A()才是对象，a1引用指向new A()这个对象（存放了该对象的地址）；
一个对象引用可以指向0个或1个对象（一根绳子可以不系汽球，也可以系一个汽球）；
一个对象可以有N个引用指向它（可以有N条绳子系住一个汽球）；










 */

public class StringDemo {

    public static void main(String[] args) {

//        String s1=new String("hello");
//        String s2="hello";
//
//        System.out.println("两个字符串的地址不一样:"+s1==s2);
//
//        System.out.println("但是两个字符串的值一样:"+s1.equals(s2));

//        String s1 = "hello";
//        String s2 = "world";
//        String s3 = "helloworld";
//
////        以变量的形式相加
//        String s4 = s1 + s2;
////        以常量的形式相加
//        String s5 = "hello"+"world";
//
////        值肯定一样
//        System.out.println(s4);
//        System.out.println(s5);
//
////但引用值有区别
////        变量的形式不一样
//        System.out.println(s3 == s1 + s2);// false
////        常量的形式一样
//		System.out.println(s3 == "hello" + "world");// true






    }




}
