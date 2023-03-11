package com.jc.Project03.domain.employee;

import lombok.*;

/*
员工类
*/

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    /*
        将“toString”方法重写，方便后续打印
    */
    @Override
    public String toString() {
        return getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary();
    }
    public String getDetails(){
        return getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary();
    }

}
