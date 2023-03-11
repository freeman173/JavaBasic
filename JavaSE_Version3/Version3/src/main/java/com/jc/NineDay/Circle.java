package com.jc.NineDay;


public class Circle {
    private double radius=1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /*
        获取圆的面积
     */
    public double getArea(){
        System.out.println(Math.PI*radius*radius);
        return Math.PI*radius*radius;
    }
}
