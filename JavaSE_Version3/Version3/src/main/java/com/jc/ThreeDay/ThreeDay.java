package com.jc.ThreeDay;


import java.util.Scanner;

public class ThreeDay {

    static final int MAX_LENGTH=10;

/*
    �õ�һ����λ����ÿ��λ��
 */
    public static void functionOne(){

        int i=199;

        int bai=i/100;

        int shi=i%100/10;

        int ge=i%10;

        System.out.println("______________________");


    }



/*
  ++�븳ֵ������Ľ��

 */
    public static void functionTwo(){
        int i=10;

        //i=i+(i++)+(++i)=10+10+12
        i+=(i++)+(++i);

        System.out.println("______________________");


}



    /*
      ��=���롰==��������

     */
    public static void functionThree(){
        int i=10,j=20;


        System.out.println(i==j);//false
        System.out.println(i=j);//20


        System.out.println("______________________");


    }


    /*
          �߼�������Ŀ���

         */
    public static void functionFour(){

        boolean x=true;
        boolean y=false;

        int i=42;

        if((i++==42) && (y=true))i++;
//        a || b ֻҪ aΪ��ʱ����ô�������ʽ�������ˣ������������b�����ֵ��
        if((x=false)||(++i==45))i++;

        System.out.println("______________________");


    }


    /*
        ��Ԫ�����

       */
    public static void functionFive(){

        int i1=20,i2=30;

        int max=(i1>i2)?i1:i2;



        System.out.println("______________________");


    }



    /*
       scanner�ļ�ʹ��



      */
    public static void functionSix(){


        Scanner scanner=new Scanner(System.in);

        System.out.println("������");
        String name=scanner.next();

        System.out.println("���䣺");
        int age=scanner.nextInt();

        System.out.println("��");
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
////        �������ȼ�����ַ������������
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
////        ������ʼ��Ҳ���Եģ�
//        String s4=123+"";
//
//        System.out.println("_____________________");



//        �ַ����Ĵ�����ʽ
//�������д��봴���������ַ�������������ַ��������ء�
//        String s5="123";
//        String s6="456"+"789";
//
////        s7�ĵ�ַ��s5һ��
//        String s7="123";
////     s7�ĵ�ַ��s5һ�����������Ϊtrue
//        Object result5=(s5==s7);
//
//
//
////   ʹ���������ķ�ʽ����������
//        // ����˫�����������Ķ����ַ�������������һ�ݡ�
//        // new�����ʱ��һ���ڶ��ڴ浱�п��ٿռ䡣
//        //s8��s9��s7������ֵ����һ���������ǵ��ַ���ֵһ����
//       //    string.equal()�Ƚϵ���������������ʾ���ַ��Ƿ����, �� == �Ƚϵ������������ַ�Ƿ����
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
