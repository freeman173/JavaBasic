package com.jc.fanshe.demo3;


//代理类
public class ServiceImplStaticProxy implements Service{

//    将代理类放进来
//    private ServiceImpl service;
    private  Service service;

    public ServiceImplStaticProxy(ServiceImpl service) {
        this.service = service;
    }

    private void proxy(){
        System.out.println("静态类的附加操作！");
    }


    @Override
    public void add() {
        proxy();
        service.add();
    }

    @Override
    public void delete() {
        proxy();
        service.delete();

    }

    @Override
    public void modify() {
        proxy();
        service.modify();
    }

    @Override
    public void select() {
        proxy();
        service.select();
    }
}