package com.jc.Tenday.demo;

public class WoMan extends Person {
    boolean isBeauty;

    public void goShopping(){
        System.out.println("女人喜欢购物！");
    }

    @Override
    public void eat() {
        System.out.println("女人喜欢吃菜！");
    }

    @Override
    public void walk() {
        System.out.println("女人喜欢散步！");
    }
}
