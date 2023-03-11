package com.jc.eightday.CustomerInformation;

import java.util.Scanner;


/*
    �������빤���ࣺ

 */
public class CMUtility {

    public static Scanner scanner=new Scanner(System.in);


    /*
        ���̶�ȡ:�ַ������ƣ��Ƿ�����ո񷵻�
     */
    public static String readKeyBoard(int limit,boolean blankReturn){

        String line="";

        while (scanner.hasNextLine()){
            line=scanner.nextLine();
            /*
                �û�ֱ�ӻس�������һ���յ��ַ�����
             */
            if(line.length()==0){
                if(blankReturn)return line;
                else continue;
            }

            /*
                ���������ַ������������⣬���������롣
             */
            if(line.length()<1 || line.length()>limit){
                System.out.println("����ĳ��������⣬����������:");
                continue;
            }
            break;

        }
        return line;

    }


    /*
        ���ڽ���˵���ѡȡ��1-5�ֱ��Ӧ5��ܡ�

     */
    public static char readMenuSelection(){
        char c;
        while (true){
            String str=readKeyBoard(1,false);
            c=str.charAt(0);
            if(c!='1' && c!='2' && c!='3' && c!='4' && c!='5'){
                System.out.println("�����д������������룺");
            }else break;
        }
        return c;
    }

    /*
      �Ӽ��̶�ȡ��һ���ַ�
     */
    public static char readChar(){
        String str=readKeyBoard(1,false);
        char c=str.charAt(0);
        return c;
    }




    /*
     �Ӽ��̶�ȡһ���ַ�������û�������ֱ�ӻس�����ʹ��Ĭ��ֵ
    */
    public static char readChar(char defaultValue){
        String str=readKeyBoard(1,true);
        return (str.length()==0)?defaultValue:str.charAt(0);
    }

    /*
    �Ӽ��̶�ȡһ�����Ȳ�����2������
   */
    public static int readInt(){
       int n=0;
       while(true){
           String str=readKeyBoard(2,false);
           try {
               n=Integer.parseInt(str);
               break;
           }catch (NumberFormatException e){
               System.out.println("���������������������룺");
           }

       }
       return n;
    }


    /*
       �Ӽ��̶�ȡһ�����Ȳ�����2������������û�������ֱ�ӻس�����ʹ��Ĭ��ֵ
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
                System.out.println("���������������������룺");
            }

        }
        return n;
    }

    /*
   �Ӽ��̶�ȡһ�����Ȳ�����limit���ַ���
  */
    public static String readStr(int limit){
        return readKeyBoard(limit,false);
    }

    /*
     �Ӽ��̶�ȡһ�����Ȳ�����limit���ַ���;����û�������ֱ�ӻس�����ʹ��Ĭ��ֵ
  */
    public static String readStr(int limit,String defaultStr){
        String str= readKeyBoard(limit,true);

        return str.equals("")?defaultStr:str;

    }



    public static char confirmSelection(){

        char c;
        while(true){
//            System.out.println("���������ѡ��(Y/N)��");
            String str=readKeyBoard(1,false).toUpperCase();//ת��Ϊ��д
            c=str.charAt(0);
            if(c!='Y'&& c!='N'){
                System.out.println("ѡ�������������:");

            }else break;

        }
        return c;
    }










}
