package com.jc.Project03.domain.equipment;

public class Printer implements Equipment{
    private String name;
    private String type;//»úÆ÷ÀàÐÍ

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
//        return null;
        return this.name+"("+this.type+")";
    }
}
