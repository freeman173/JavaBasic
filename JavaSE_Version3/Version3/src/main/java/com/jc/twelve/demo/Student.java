package com.jc.twelve.demo;

//继承抽象类并实现抽象方法
public class Student extends Person {
    private String Id;

    public Student() {

    }

    public Student(String name, int age, String id) {
        super(name, age);
        Id = id;
    }

    public void study() {
        System.out.println("学生学习！");
    }


}
