package com.jc.Tenday.demo;

public class Man extends Person{
    public boolean isSmoking;

    public void earnMoney(){
        System.out.println("���˸���׬Ǯ���ң�");
    }

    @Override
    public void eat() {
        System.out.println("����ϲ�����⣡");
    }

    @Override
    public void walk() {
        System.out.println("����ϲ���ܲ���");
    }
}
