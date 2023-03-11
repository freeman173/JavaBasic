package com.jc.Tenday.demo;

public class Man extends Person{
    public boolean isSmoking;

    public void earnMoney(){
        System.out.println("男人负责赚钱养家！");
    }

    @Override
    public void eat() {
        System.out.println("男人喜欢吃肉！");
    }

    @Override
    public void walk() {
        System.out.println("男人喜欢跑步！");
    }
}
