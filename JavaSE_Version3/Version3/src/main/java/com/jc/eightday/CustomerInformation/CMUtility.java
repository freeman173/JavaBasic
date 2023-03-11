package com.jc.eightday.CustomerInformation;

import java.util.Scanner;


/*
    界面输入工具类：

 */
public class CMUtility {

    public static Scanner scanner=new Scanner(System.in);


    /*
        键盘读取:字符数限制，是否允许空格返回
     */
    public static String readKeyBoard(int limit,boolean blankReturn){

        String line="";

        while (scanner.hasNextLine()){
            line=scanner.nextLine();
            /*
                用户直接回车，返回一个空的字符串；
             */
            if(line.length()==0){
                if(blankReturn)return line;
                else continue;
            }

            /*
                如果输入的字符串长度有问题，就重新输入。
             */
            if(line.length()<1 || line.length()>limit){
                System.out.println("输入的长度有问题，请重新输入:");
                continue;
            }
            break;

        }
        return line;

    }


    /*
        用于界面菜单的选取：1-5分别对应5项功能。

     */
    public static char readMenuSelection(){
        char c;
        while (true){
            String str=readKeyBoard(1,false);
            c=str.charAt(0);
            if(c!='1' && c!='2' && c!='3' && c!='4' && c!='5'){
                System.out.println("输入有错误，请重新输入：");
            }else break;
        }
        return c;
    }

    /*
      从键盘读取第一个字符
     */
    public static char readChar(){
        String str=readKeyBoard(1,false);
        char c=str.charAt(0);
        return c;
    }




    /*
     从键盘读取一个字符；如果用户不输入直接回车，就使用默认值
    */
    public static char readChar(char defaultValue){
        String str=readKeyBoard(1,true);
        return (str.length()==0)?defaultValue:str.charAt(0);
    }

    /*
    从键盘读取一个长度不超过2的整数
   */
    public static int readInt(){
       int n=0;
       while(true){
           String str=readKeyBoard(2,false);
           try {
               n=Integer.parseInt(str);
               break;
           }catch (NumberFormatException e){
               System.out.println("数字输入有误，请重新输入：");
           }

       }
       return n;
    }


    /*
       从键盘读取一个长度不超过2的整数；如果用户不输入直接回车，就使用默认值
      */
    public static int readInt(int defaultValue){
        int n=0;
        while(true){
            String str=readKeyBoard(2,true);
            if(str.equals("")){
                return defaultValue;
            }

            try {
                n=Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("数字输入有误，请重新输入：");
            }

        }
        return n;
    }

    /*
   从键盘读取一个长度不超过limit的字符串
  */
    public static String readStr(int limit){
        return readKeyBoard(limit,false);
    }

    /*
     从键盘读取一个长度不超过limit的字符串;如果用户不输入直接回车，就使用默认值
  */
    public static String readStr(int limit,String defaultStr){
        String str= readKeyBoard(limit,true);

        return str.equals("")?defaultStr:str;

    }



    public static char confirmSelection(){

        char c;
        while(true){
//            System.out.println("请输入你的选择(Y/N)：");
            String str=readKeyBoard(1,false).toUpperCase();//转化为大写
            c=str.charAt(0);
            if(c!='Y'&& c!='N'){
                System.out.println("选择错误，重新输入:");

            }else break;

        }
        return c;
    }










}
