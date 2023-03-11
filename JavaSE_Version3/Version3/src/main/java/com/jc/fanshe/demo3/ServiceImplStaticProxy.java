package com.jc.fanshe.demo3;


//������
public class ServiceImplStaticProxy implements Service{

//    ��������Ž���
//    private ServiceImpl service;
    private  Service service;

    public ServiceImplStaticProxy(ServiceImpl service) {
        this.service = service;
    }

    private void proxy(){
        System.out.println("��̬��ĸ��Ӳ�����");
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