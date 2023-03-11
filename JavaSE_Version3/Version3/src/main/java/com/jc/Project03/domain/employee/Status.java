package com.jc.Project03.domain.employee;

import lombok.Getter;
import lombok.Setter;

/*
状态类：
    这样用也方便！(有些看不懂)

*/
@Getter
@Setter
public class Status {
    private final String NAME;
    public Status(String name){
        this.NAME=name;
    }

    public static final Status FREE=new Status("FREE");//空闲
    public static final Status BUSY=new Status("BUSY");//繁忙
    public static final Status VOCATION=new Status("VOCATION");//度假

    @Override
    public String toString() {
        return NAME;
    }


}
