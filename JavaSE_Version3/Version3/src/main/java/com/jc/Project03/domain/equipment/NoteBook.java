package com.jc.Project03.domain.equipment;

public class NoteBook implements Equipment{
    private String model;//�����ͺ�
    private double price;//�۸�

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return this.model+"("+this.price+")";
    }
}
