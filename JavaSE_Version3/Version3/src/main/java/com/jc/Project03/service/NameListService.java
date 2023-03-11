package com.jc.Project03.service;


import com.jc.Project03.domain.employee.Architect;
import com.jc.Project03.domain.employee.Designer;
import com.jc.Project03.domain.employee.Employee;
import com.jc.Project03.domain.employee.Programmer;
import com.jc.Project03.domain.equipment.Equipment;
import com.jc.Project03.domain.equipment.NoteBook;
import com.jc.Project03.domain.equipment.PC;
import com.jc.Project03.domain.equipment.Printer;
import lombok.NoArgsConstructor;
import com.jc.Project03.service.Data.*;

import static com.jc.Project03.service.Data.*;
/*
@author 蒋超
@since version-1.0
@date 2023/2/5 12:55
@description:
    主要功能：将数据封装到Employee[]数组中，同时提供相关操作的方法！

*/

public class NameListService {
    private Employee[] employees;

    /*
    @author 蒋超
    @since version-1.0
    @date 2023/2/5 13:10
    @description
        将employees做一个初始化操作
    */
    public NameListService(){

        employees=new Employee[EMPLOYEES.length];//获取数组长度
//        根据类别对数组做一个初始化操作
        for(int i=0;i<employees.length;i++){
//            获取员工类型
            int type=Integer.parseInt(EMPLOYEES[i][0]);
//            再把前4个基本信息获取一下
            int id=Integer.parseInt(EMPLOYEES[i][1]);
            String name=EMPLOYEES[i][2];
            int age=Integer.parseInt(EMPLOYEES[i][3]);
            double salary=Double.parseDouble(EMPLOYEES[i][4]);
//            再根据员工类型做一个剩余信息的填充操作
            switch (type){
                case EMPLOYEE:
                    employees[i]=new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                     employees[i]=new Programmer(id,name,age,salary,createEquipment(i));
                     break;
                case DESIGNER:
                    employees[i]=new Designer(id,name,age,salary,createEquipment(i),Double.parseDouble(EMPLOYEES[i][5]));
                    break;
                case ARCHITECT:
                    employees[i]=new Architect(id,name,age,salary,createEquipment(i),Double.parseDouble(EMPLOYEES[i][5]),Integer.parseInt(EMPLOYEES[i][6]));
            }


        }
        System.out.println("________________");



    }

    /*
    @author 蒋超
    @since version-1.0
    @date 2023/2/6 20:13
    @param
    @return
    @description :
        为员工类型创建指定的设备对象
    */
    private Equipment createEquipment(int index){
        int type=Integer.parseInt(EQUITMENTS[index][0]);
        switch (type){//根据不同类型的数据返回不同的值
            case PC:
                return new PC(EQUITMENTS[index][1],EQUITMENTS[index][2]);
            case NOTEBOOK:
                return new NoteBook(EQUITMENTS[index][1],Double.parseDouble(EQUITMENTS[index][2]));
            case PRINTER:
                return new Printer(EQUITMENTS[index][1],EQUITMENTS[index][2]);

        }
        return null;
    }





    public Employee[] getAllEmployees(){
        return employees;
    }


    public Employee getEmployeebyId(int id) throws TeamException {
        for(int i=0;i<employees.length;i++){
            if(employees[i].getId()==id){//找到对应id的员工信息
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");

    }




}
