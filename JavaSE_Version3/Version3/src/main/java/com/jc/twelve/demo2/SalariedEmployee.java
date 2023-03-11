package com.jc.twelve.demo2;

/*
��ͬ����
    ���·��š�

 */
public class SalariedEmployee extends Employee{

    private double monthSalary;

    public SalariedEmployee(String name, int number, MyDate birthday,double monthSalary) {
        super(name, number, birthday);
        this.monthSalary=monthSalary;
    }

    public double earnings() {
        return monthSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString()+"monthSalary=" + monthSalary + '}';
    }
}
