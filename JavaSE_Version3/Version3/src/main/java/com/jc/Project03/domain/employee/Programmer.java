package com.jc.Project03.domain.employee;


import com.jc.Project03.domain.equipment.Equipment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



/*
����Գ
*/
@Getter
@Setter
public class Programmer extends Employee{
    private int memberId;//�����Ŷ��е�id
    private Status status;//״̬����ǰ�Ƿ���С�
    private Equipment equipment;

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.status=Status.FREE;
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.toString() +"\t����Գ\t"+status+"\t\t\t"+equipment.getDescription();
    }
}
