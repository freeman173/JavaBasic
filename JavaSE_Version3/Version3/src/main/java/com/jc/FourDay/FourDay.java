package com.jc.FourDay;

import com.jc.FourDay.ProjectOne.FamilyAccount;

public class FourDay {

    /*
      switch-case�ļ�ʹ�ã�
            ����ƥ��case�еĳ�����һ��ƥ��ɹ����������Ӧ��case�ṹִ�ж�Ӧ��䣻
            ��ִ�����Ӧ���󣬻��������ִ�к���case�Լ�default�Ķ�Ӧ��䣬����������break����
     */
    public static void functionOne(){

        int number=1;
        switch (number){
            case 0:
                System.out.println("ZERO");break;
            case 1:
                System.out.println("ONE");
            case 2:
                System.out.println("TWO");
            case 3:
                System.out.println("THREE");
            default:
                System.out.println("OTHER");
        }

        System.out.println("_______________________");




    }


    /*
    for ѭ����ʹ��

   */
    public static void functionTwo(){


        for(int i=0;i<=100;i++){

            if(i%2==0){
                System.out.print(i+"\t");
            }
        }
//        System.out.println();
        System.out.println("_______________________");




    }



    /*
      while ѭ����ʹ��

     */
    public static void functionThree(){

        int i=0;
        while(i<=100){
            if(i%2==0){
                System.out.print(i+"\t");
            }
            i++;
        }
        System.out.println("\n"+i);
        System.out.println("_______________________");


    }



    /*
     Ƕ��ѭ���ļ�Ӧ�ã��žų˷���
    */
    public static void functionFour(){

        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.print("\n");
        }



        System.out.println("_______________________");



    }



    /*

        continue��ʹ��

       */
    public static void functionFive(){

        label:for(int i=0;i<5;i++){
            for(int j=1;j<10;j++){
                if(j%2==0){
                   continue label;//����label��ʶ�ı���ѭ��
                }
                System.out.print(j+"\t");

            }
            System.out.print("\n");
        }




        System.out.println("_______________________");



    }

    public static void main(String[] jc){

//        functionOne();
//        functionTwo();
//         functionThree();
//        functionFour();
//        functionFive();
        FamilyAccount.main(null);
    }


}
