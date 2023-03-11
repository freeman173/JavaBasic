package com.jc.Project03.domain.employee;

import com.jc.Project03.domain.equipment.Equipment;
import lombok.Getter;
import lombok.Setter;


/*
设计师
*/
@Getter
@Setter
public class Designer extends Programmer{

    private double bonus;//奖金

    public Designer(int id, String name, int age, double salary, Equipment equipment,double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus=bonus;
    }

    @Override
    public String toString() {
        return getDetails() +"\t设计师\t"+super.getStatus()+"\t\t"+bonus+"\t\t"+getEquipment().getDescription();
    }
}
