package com.jc.Project03.domain.employee;


import com.jc.Project03.domain.equipment.Equipment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



/*
程序猿
*/
@Getter
@Setter
public class Programmer extends Employee{
    private int memberId;//开发团队中的id
    private Status status;//状态：当前是否空闲。
    private Equipment equipment;

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.status=Status.FREE;
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.toString() +"\t程序猿\t"+status+"\t\t\t"+equipment.getDescription();
    }
}
