package com.jc.fanshe.demo3;

//具体业务类(被代理类)
public class ServiceImpl implements Service {

    @Override
    public void add() {
        System.out.println("执行了add操作");
    }

    @Override
    public void delete() {
        System.out.println("执行了delete操作");
    }

    @Override
    public void modify() {
        System.out.println("执行了modify操作");
    }

    @Override
    public void select() {
        System.out.println("执行了add操作");
    }
}