package com.jc.twelve.demo;

/*


这是一个抽象类：


 */


public abstract class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void walk(){
        System.out.println("人走路");

    }

    public abstract void study();

//    public abstract void play();

}



