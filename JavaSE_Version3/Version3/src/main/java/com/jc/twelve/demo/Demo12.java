package com.jc.twelve.demo;

public class Demo12 {
    static String name="����";
    private String myName="����";
    private int age=24;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Demo12.name = name;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
