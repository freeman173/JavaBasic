package com.jc.Project03.service;

/*
@author 蒋超
@since version-1.0
@date 2023/2/6 21:07
@description:一个自定义异常类

*/
public class TeamException extends Exception{
//    我也不清楚这个常量是干啥的
    static final long serialVersionUID = -3387516993124229948L;


    public TeamException() {
        super();
    }

    public TeamException(String msg) {
        super(msg);
    }

}