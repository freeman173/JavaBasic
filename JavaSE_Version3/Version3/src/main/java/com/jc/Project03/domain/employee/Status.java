package com.jc.Project03.domain.employee;

import lombok.Getter;
import lombok.Setter;

/*
״̬�ࣺ
    ������Ҳ���㣡(��Щ������)

*/
@Getter
@Setter
public class Status {
    private final String NAME;
    public Status(String name){
        this.NAME=name;
    }

    public static final Status FREE=new Status("FREE");//����
    public static final Status BUSY=new Status("BUSY");//��æ
    public static final Status VOCATION=new Status("VOCATION");//�ȼ�

    @Override
    public String toString() {
        return NAME;
    }


}
