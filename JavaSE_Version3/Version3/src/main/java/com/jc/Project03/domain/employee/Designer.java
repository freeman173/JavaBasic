package com.jc.Project03.domain.employee;

import com.jc.Project03.domain.equipment.Equipment;
import lombok.Getter;
import lombok.Setter;


/*
���ʦ
*/
@Getter
@Setter
public class Designer extends Programmer{

    private double bonus;//����

    public Designer(int id, String name, int age, double salary, Equipment equipment,double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus=bonus;
    }

    @Override
    public String toString() {
        return getDetails() +"\t���ʦ\t"+super.getStatus()+"\t\t"+bonus+"\t\t"+getEquipment().getDescription();
    }
}
