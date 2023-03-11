package com.jc.twelve.demo2;

/*
小时工：
 */
public class HourlyEmployee extends Employee{
    private int wage;//小时费
    private int hours;//小时数

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
