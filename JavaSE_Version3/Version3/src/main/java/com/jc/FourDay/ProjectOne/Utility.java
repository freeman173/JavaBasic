package com.jc.FourDay.ProjectOne;


import org.junit.Test;

import java.util.Scanner;

public class Utility {
    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] dd){

        readKeyBoard();

    }

    public static String readKeyBoard(){

        String name=scanner.next();
        return name;

    }

    public static int readInt(){

        int name=scanner.nextInt();
        return name;

    }

    /*
    �û�ѡ��˵�
     */
    public static char readMenuSelection(){

        char c;

        while(true){
            System.out.println("���������ѡ��(1/2/3/4)��");
            String str=readKeyBoard();
            c=str.charAt(0);
            if(c!='1'&& c!='2'&& c!='3'&& c!='4'){
                System.out.println("ѡ�������������:");

            }else break;

        }
        return c;
    }



    /*
        �û��Ƿ��˳���ȷ��
     */
    public static char confirmSelection(){

        char c;

        while(true){
            System.out.println("���������ѡ��(Y/N)��");
            String str=readKeyBoard().toUpperCase();//ת��Ϊ��д
            c=str.charAt(0);
            if(c!='Y'&& c!='N'){
                System.out.println("ѡ�������������:");

            }else break;

        }

        return c;
    }










//    public static void main(String[] jc){
////        readMenuSelection();
//        confirmSelection();
//    }


}
