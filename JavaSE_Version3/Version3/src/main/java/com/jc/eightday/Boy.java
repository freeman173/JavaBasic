package com.jc.eightday;


public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name) {
        this();
        this.name = name;
    }

//    调用其他构造器
    public Boy(String name, int age) {
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }

    public void shout(){
        if(this.age>21){
            System.out.println("你可以结婚了！");
        }
    }

}
