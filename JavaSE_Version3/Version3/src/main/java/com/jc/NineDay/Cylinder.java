package com.jc.NineDay;

/*
Բ���̳���Բ
 */
public class Cylinder extends Circle {

    private double length=1.0;

    public Cylinder(double radius, double length) {
        super(radius);
        this.length = length;
    }




    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getVolume(){
        return getArea()*getLength();
    }


    public double getArea(){
        System.out.println("������д��ķ��������ڻ�ȡ�������");
        return 0;
    }



    public static void main(String[] jc){
        Cylinder cylinder=new Cylinder(2,2);
        cylinder.getArea();



    }

}
