package com.jc.twelve.demo2;

/*

创建一个数组，存放各类员工的引用；
利用循环结构遍历数组元素，输出各个员工的信息（如果是某个员工的生日，还得增加工资100。）

 */


import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {

    public static void main(String[] jc){

        /*
            构造员工的信息
         */
        Employee[] employees=new Employee[2];
        employees[0]=new SalariedEmployee("蒋超",1001,new MyDate(1997,11,17),18000);
        employees[1]=new HourlyEmployee("c超",1002,new MyDate(1996,11,17),300,20);


        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
            double salary=employees[i].earnings();
            System.out.println("月工资："+salary);
        }



        System.out.println("_____________________");

    }




}
