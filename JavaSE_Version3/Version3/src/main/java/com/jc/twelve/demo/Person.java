package com.jc.twelve.demo;

/*


����һ�������ࣺ


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
        System.out.println("�˳Է�");
    }

    public void walk(){
        System.out.println("����·");

    }

    public abstract void study();

//    public abstract void play();

}



