package com.jc.FourDay;

import com.jc.FourDay.ProjectOne.FamilyAccount;

public class FourDay {

    /*
      switch-case的简单使用：
            依次匹配case中的常量，一旦匹配成功，则进入相应的case结构执行对应语句；
            当执行完对应语句后，会继续依次执行后续case以及default的对应语句，除非遇到“break”。
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
    for 循环的使用

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
      while 循环的使用

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
     嵌套循环的简单应用：九九乘法表
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

        continue的使用

       */
    public static void functionFive(){

        label:for(int i=0;i<5;i++){
            for(int j=1;j<10;j++){
                if(j%2==0){
                   continue label;//结束label标识的本次循环
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
