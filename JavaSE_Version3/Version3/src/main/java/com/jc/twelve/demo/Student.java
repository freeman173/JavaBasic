package com.jc.twelve.demo;

//�̳г����ಢʵ�ֳ��󷽷�
public class Student extends Person {
    private String Id;

    public Student() {

    }

    public Student(String name, int age, String id) {
        super(name, age);
        Id = id;
    }

    public void study() {
        System.out.println("ѧ��ѧϰ��");
    }


}
