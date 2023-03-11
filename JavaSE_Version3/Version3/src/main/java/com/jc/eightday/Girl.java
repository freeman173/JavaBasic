package com.jc.eightday;

public class Girl {
    private String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
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

    public void marry(Boy boy){

        System.out.println("����޸�"+boy.getName());
        boy.marry(this);
    }

    /*
        �Ƚ������˵�����

     */
    public int compare(Girl girl){

        if(this.getAge()>girl.getAge()){
            return 1;
        }else if(this.getAge()<girl.getAge()){
            return -1;
        }else {
            return 0;
        }
    }


}
