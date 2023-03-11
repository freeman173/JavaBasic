package com.jc.bijiaoqi;

/*
@author 蒋超
@since version-1.0
@date 2023/2/22 10:17
@description:
    对象之间的比较：
            需要借助接口Comparable/Comparator



*/

import java.util.Arrays;

public class Demo1 {


  /*
    Comparable:
        强行对实现它的每个类的对象进行整体排序。（自然排序）
  */
    public static void One(){
        String[] arr=new String[]{"BB","AA","GG","DD","FF","ZZ","KK"};
        Arrays.sort(arr);


        System.out.println("_____________");

    }

    /*
        自定义实现Comparable接口
  */
    public static void Two(){
        Goods[] goods=new Goods[]{new Goods("dd",100),new Goods("aa",70),new Goods("ww",12)};

        Arrays.sort(goods);


        System.out.println("_____________");

    }



    public static void main(String[] DD){
        Two();



    }
}