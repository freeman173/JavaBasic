package com.jc.Tenday.demo2;

public class GeometricTest {
    /*
        ���Բ�����
     */
    public static void displayGeometricObject(GeometricObject object){
        System.out.println("���Ϊ��"+object.findArea());
    }


    /*
       �ж�����ͼ�ε�����Ƿ����
    */
    public static boolean equalArea(GeometricObject object1 ,GeometricObject object2){
        return object1.findArea()==object2.findArea();
    }

    public static void main(String[] jc){
        GeometricObject o1=new MyRectangle("",0,10,5);
        GeometricObject o2=new MyRectangle("",0,2,25);

        GeometricTest.displayGeometricObject(o1);
        Object result=GeometricTest.equalArea(o1,o2);

        System.out.println("_________________");

    }




}
