package com.jc.twelve.demo2;

/*

����һ�����飬��Ÿ���Ա�������ã�
����ѭ���ṹ��������Ԫ�أ��������Ա������Ϣ�������ĳ��Ա�������գ��������ӹ���100����

 */


import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {

    public static void main(String[] jc){

        /*
            ����Ա������Ϣ
         */
        Employee[] employees=new Employee[2];
        employees[0]=new SalariedEmployee("����",1001,new MyDate(1997,11,17),18000);
        employees[1]=new HourlyEmployee("c��",1002,new MyDate(1996,11,17),300,20);


        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
            double salary=employees[i].earnings();
            System.out.println("�¹��ʣ�"+salary);
        }



        System.out.println("_____________________");

    }




}
