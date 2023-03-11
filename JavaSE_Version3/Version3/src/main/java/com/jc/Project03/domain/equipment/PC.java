package com.jc.Project03.domain.equipment;

/*
电脑类
*/
public class PC implements Equipment{
    private String model;//机器型号
    private String display;//显示器名称

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
        将设备的名称与显示器型号信息返回
    */
    @Override
    public String getDescription() {
        return this.model+"("+this.display+")";
    }



}
