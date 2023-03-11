package com.jc.Project03.domain.employee;

import com.jc.Project03.domain.equipment.Equipment;
import lombok.Getter;
import lombok.Setter;


/*
�ܹ�ʦ
*/
@Getter
@Setter
public class Architect extends Designer{
    private int stock;


    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus,int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock=stock;
    }

    @Override
    public String toString() {
        return getDetails() +"\t�ܹ�ʦ\t"+getStatus()+"\t\t"+getBonus()+"\t\t"+getStock()+"\t\t"+getEquipment().getDescription();
    }




}
