package com.jc.bijiaoqi;

/*
@author ����
@since version-1.0
@date 2023/2/22 10:17
@description:
    ����֮��ıȽϣ�
            ��Ҫ�����ӿ�Comparable/Comparator



*/

import java.util.Arrays;

public class Demo1 {


  /*
    Comparable:
        ǿ�ж�ʵ������ÿ����Ķ�������������򡣣���Ȼ����
  */
    public static void One(){
        String[] arr=new String[]{"BB","AA","GG","DD","FF","ZZ","KK"};
        Arrays.sort(arr);


        System.out.println("_____________");

    }

    /*
        �Զ���ʵ��Comparable�ӿ�
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