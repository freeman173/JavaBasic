package com.jc.twelve.demo2;

/*
Сʱ����
 */
public class HourlyEmployee extends Employee{
    private int wage;//Сʱ��
    private int hours;//Сʱ��

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hours) {
        super(name, number, birthday);
        this.wage = wage;
        this.hours = hours;
    }


    public double earnings() {
        return wage*hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString()+" hours=" + hours + '}';
    }
}
