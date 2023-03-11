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
    用户选择菜单
     */
    public static char readMenuSelection(){

        char c;

        while(true){
            System.out.println("请输入你的选择(1/2/3/4)：");
            String str=readKeyBoard();
            c=str.charAt(0);
            if(c!='1'&& c!='2'&& c!='3'&& c!='4'){
                System.out.println("选择错误，重新输入:");

            }else break;

        }
        return c;
    }



    /*
        用户是否退出的确认
     */
    public static char confirmSelection(){

        char c;

        while(true){
            System.out.println("请输入你的选择(Y/N)：");
            String str=readKeyBoard().toUpperCase();//转化为大写
            c=str.charAt(0);
            if(c!='Y'&& c!='N'){
                System.out.println("选择错误，重新输入:");

            }else break;

        }

        return c;
    }










//    public static void main(String[] jc){
////        readMenuSelection();
//        confirmSelection();
//    }


}
