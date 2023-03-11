package com.jc.ThreeDay;


import java.util.Scanner;

public class ThreeDay {

    static final int MAX_LENGTH=10;

/*
    得到一个三位数的每个位！
 */
    public static void functionOne(){

        int i=199;

        int bai=i/100;

        int shi=i%100/10;

        int ge=i%10;

        System.out.println("______________________");


    }



/*
  ++与赋值运算符的结合

 */
    public static void functionTwo(){
        int i=10;

        //i=i+(i++)+(++i)=10+10+12
        i+=(i++)+(++i);

        System.out.println("______________________");


}



    /*
      “=”与“==”的区别

     */
    public static void functionThree(){
        int i=10,j=20;


        System.out.println(i==j);//false
        System.out.println(i=j);//20


        System.out.println("______________________");


    }


    /*
          逻辑运算符的考察

         */
    public static void functionFour(){

        boolean x=true;
        boolean y=false;

        int i=42;

        if((i++==42) && (y=true))i++;
//        a || b 只要 a为真时，那么整个表达式就是真了，不会继续计算b的真假值。
        if((x=false)||(++i==45))i++;

        System.out.println("______________________");


    }


    /*
        三元运算符

       */
    public static void functionFive(){

        int i1=20,i2=30;

        int max=(i1>i2)?i1:i2;



        System.out.println("______________________");


    }



    /*
       scanner的简单使用



      */
    public static void functionSix(){


        Scanner scanner=new Scanner(System.in);

        System.out.println("姓名：");
        String name=scanner.next();

        System.out.println("年龄：");
        int age=scanner.nextInt();

        System.out.println("存款：");
        double money=scanner.nextDouble();

        scanner.close();




        System.out.println("______________________");


    }


    public static void main(String[] jc){

//        String s1="i am a student";
//        int i1=100;
//        String s2=s1+i1;
//
//        System.out.println("______________");
//
//
////        运算优先级结合字符串的运算规律
//        String s3="hello";
//        char c1='a';
//        int i3=10;
//
//        String result1=s3+c1+i3;
//        String result2=c1+i3+s3;
//
//
//        System.out.println("______________");
//
//
////        这样初始化也可以的！
//        String s4=123+"";
//
//        System.out.println("_____________________");



//        字符串的创建方式
//下面两行代码创建了三个字符串，都存放在字符串常量池。
//        String s5="123";
//        String s6="456"+"789";
//
////        s7的地址跟s5一样
//        String s7="123";
////     s7的地址跟s5一样，所以输出为true
//        Object result5=(s5==s7);
//
//
//
////   使用面向对象的方式来创建对象
//        // 凡是双引号括起来的都在字符串常量池中有一份。
//        // new对象的时候一定在堆内存当中开辟空间。
//        //s8、s9、s7的引用值都不一样，但它们的字符串值一样；
//       //    string.equal()比较的是两个对象所表示的字符是否相等, 而 == 比较的是两个对象地址是否相等
//        String s8=new String("123");
//        String s9=new String("123");
//
//        Object result6=(s8==s7);


//        ++,--

//        int i7=100;
//        int i8=++i7;
//        int i9=i7--;





//        functionOne();
//        functionTwo();
//       functionThree();
//         functionFour();
//        functionFive();
         functionFour();

        System.out.println("____________________");















    }
}
