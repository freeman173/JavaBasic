package com.jc.twelve.demo4;

/*
关于成员内部类的一些案例:

静态内部类中是否可以直接访问外部类的实例成员？
    不可以的，外部类的实例成员必须用外部类对象访问。

成员内部类的实例方法中是否可以直接访问外部类的实例成员？
    可以的



*/


class Person{

    String name="蒋超";
    int age=25;
    public static void run(){
        System.out.println("这是一个静态方法");
    }
    public void eat(){
        System.out.println("超人吃饭！");
    }

//    静态成员内部类
    static class Dog{
        String name="大黄";
        int age;
        public void show(){
            System.out.println("我是一条狗！");

        }
    }

//    非静态成员内部类
    class Bird{
        String name="喜鹊";
        public void sing(){
            System.out.println("我是一只小小鸟");
//            调用外部类的非静态方法
            Person.this.eat();
//          调用外部类的静态方法
            run();
        }


    }
}




public class InterObjectTest {

    public static void main(String[] jc){

//        创建一个静态内部类
        Person.Dog dog=new Person.Dog();
        dog.show();

        //        创建一个非静态内部类
        Person p=new Person();
        Person.Bird bird=p.new Bird();
        bird.sing();



        System.out.println("_____________");


    }

}
