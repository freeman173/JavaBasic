package com.jc.Project03.domain.equipment;

/*
������
*/
public class PC implements Equipment{
    private String model;//�����ͺ�
    private String display;//��ʾ������

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    /*
        ���豸����������ʾ���ͺ���Ϣ����
    */
    @Override
    public String getDescription() {
        return this.model+"("+this.display+")";
    }



}
