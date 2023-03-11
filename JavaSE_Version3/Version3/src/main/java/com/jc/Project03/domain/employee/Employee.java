package com.jc.Project03.domain.employee;

import lombok.*;

/*
Ա����
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
        ����toString��������д�����������ӡ
    */
    @Override
    public String toString() {
        return getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary();
    }
    public String getDetails(){
        return getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary();
    }

}
