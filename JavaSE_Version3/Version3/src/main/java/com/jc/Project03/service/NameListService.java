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
@author ����
@since version-1.0
@date 2023/2/5 12:55
@description:
    ��Ҫ���ܣ������ݷ�װ��Employee[]�����У�ͬʱ�ṩ��ز����ķ�����

*/

public class NameListService {
    private Employee[] employees;

    /*
    @author ����
    @since version-1.0
    @date 2023/2/5 13:10
    @description
        ��employees��һ����ʼ������
    */
    public NameListService(){

        employees=new Employee[EMPLOYEES.length];//��ȡ���鳤��
//        ��������������һ����ʼ������
        for(int i=0;i<employees.length;i++){
//            ��ȡԱ������
            int type=Integer.parseInt(EMPLOYEES[i][0]);
//            �ٰ�ǰ4��������Ϣ��ȡһ��
            int id=Integer.parseInt(EMPLOYEES[i][1]);
            String name=EMPLOYEES[i][2];
            int age=Integer.parseInt(EMPLOYEES[i][3]);
            double salary=Double.parseDouble(EMPLOYEES[i][4]);
//            �ٸ���Ա��������һ��ʣ����Ϣ��������
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
    @author ����
    @since version-1.0
    @date 2023/2/6 20:13
    @param
    @return
    @description :
        ΪԱ�����ʹ���ָ�����豸����
    */
    private Equipment createEquipment(int index){
        int type=Integer.parseInt(EQUITMENTS[index][0]);
        switch (type){//���ݲ�ͬ���͵����ݷ��ز�ͬ��ֵ
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
            if(employees[i].getId()==id){//�ҵ���Ӧid��Ա����Ϣ
                return employees[i];
            }
        }
        throw new TeamException("�Ҳ���ָ����Ա��");

    }




}
