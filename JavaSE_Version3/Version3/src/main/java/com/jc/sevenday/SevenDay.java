package com.jc.sevenday;











public class SevenDay {


/*

ʵ��һ�����ô���
 */
    static void Change(char[] a){
        a[0]='b';
    }
    static void One(){

        char[] a=new String("abcdefg").toCharArray();
        Change(a);
        System.out.println("_____________");

    }



    /*

       ����������ʹ��:

     */
    static void Two(){

        TriAngle triAngle=new TriAngle(1.0,2.0);

        triAngle.getArea();

        System.out.println("_________________");
    }







    public static void main(String[] args){

//        One();
        Two();

    }


}




