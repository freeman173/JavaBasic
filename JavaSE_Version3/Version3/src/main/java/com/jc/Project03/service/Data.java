package com.jc.Project03.service;

import com.jc.twelve.demo2.Employee;

public class Data {

    /*
        员工的枚举列表
    */
    public static final int EMPLOYEE=10;//员工
    public static final int PROGRAMMER=11;
    public static final int DESIGNER=12;
    public static final int ARCHITECT=13;
    /*
           设备的枚举列表
       */
    public static final int PC=21;
    public static final int NOTEBOOK=22;
    public static final int PRINTER=23;

    /*
        几个人物成员的属性注释
            Employee:10，id，name，age，salary
            programmer:10，id，name，age，salary
            designer:10，id，name，age，salary，bonus
            architect:10，id，name，age，salary，stock
    */
    public static final String[][] EMPLOYEES={
            {"10","1","蒋超","25","3000"},
            {"13","2","刘琪","25","3000","18000","15000","2000"},
            {"11","3","警徽","25","3000"},
            {"11","4","俊俊","25","3000"},
            {"12","5","正林","25","3000","5000"},
            {"11","6","涛人","25","3000"},
            {"12","7","马超","25","3000","34543"},
            {"13","8","鲁班","25","3000","234","23"},
            {"12","9","我棋","25","3000","567"},
            {"11","10","章程","25","3000"},
            {"11","11","启强","25","3000"},
            {"12","12","宏伟","25","3000","12394"},
    };

    /*
       几个设备成员的属性注释
           PC:21，id，name，age，salary
           NOTEBOOK:22，id，name，age，salary
           printer:23，id，name，age，salary，bonus

   */
    public static final String[][] EQUITMENTS={
            {},
            {"22","联想","6000"},
            {"21","戴尔","NEC17"},
            {"21","戴尔","三星17寸"},
            {"23","佳能2900","激光"},
            {"21","华硕","三星17寸"},
            {"21","华硕","三星17寸"},
            {"23","爱普生","针式"},
            {"22","惠普","5800"},
            {"21","戴尔","nec17寸"},
            {"21","华硕","三星17寸"},
            {"22","惠普","5800"},
    };








}
