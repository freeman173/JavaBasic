package com.jc.FiveDay;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FiveDay {

    /*
    һά����ĳ�ʼ��
     */
    public static void One(){

/*

        ����ĳ�ʼ����
          ��̬�붯̬��ʼ������������ڣ�ǰ����������ʱ��ͳ�ʼ�������������������ٶ�̬��ʼ����

 */

//        ��̬��ʼ��
        int[] i1=new int[]{1,2,3,4,5};
//        int[] i1={1,2,3,4,5};
//        ��̬��ʼ��
        int[] i2=new int[5];


//        string�ĵײ����ͨ��char[]ʵ�ֵģ������������������˽⡣
        char[] c1=new char[]{'1','2','3','4','5'};
        String s1=new String(c1);



        System.out.println("______________");
    }



    /*
        ����ĳ�ʼ����Ĭ��ֵ
   */
    public static void Two(){

        int[] i1=new int[5];
        double[] d1=new double[5];
        char[] c1=new char[5];
        String[] s1=new String[5];



        System.out.println("______________");
    }


    /*
          һά������ڴ�:

     */
    public static void Three(){



        int[] i1=new int[5];//���Ϊջ�е��������ͱ������ұ�Ϊ���е������ڴ�ռ䣻�ұ߰ѵ�ַ���������

        System.out.println(i1);




        System.out.println("______________");
    }




    /*
       ��ά����ĳ�ʼ��ֵ:
          int[][] i2=new int[3][2]
                i2[0]��ֵΪ��ַ
                i2[0][0]ֵΪ0

          int[][] i3=new int[3][];
                i3[0]��ֵΪ��null




      */
    public static void Four(){


        int[][] i1=new int[][]{{1,2,3},{4,5},{6,7,8,9,10}};
        int[][] i2=new int[3][2];


/*              ���ֺܾ��䣺��ʾ������һ���������ñ���x����һ��Ԫ��Ϊx[0],��n��Ԫ�ر���Ϊx[n-1]��
                x�д� x[0] �� x[n-1] ��ÿ��Ԫ������һ���������͵��������ñ�������δҪ������������
                ����ĳ����Ƕ��٣�Ҳ����˵ÿ����������ĳ��ȿ��Բ�һ����
                */

        int[][] i3=new int[3][];
        i3[0]=new int[5];






        System.out.println("______________");
    }



    /*

        ���鹤�����ʹ��,

   */
    public static void Five(){

        int[] i1=new int[]{1,2,3,4,5};
        int[] i2=new int[]{1,2,3,4,5};
        int[] i3=new int[]{1,10,3,7,9};

        Arrays.sort(i3);





        System.out.println("______________");
    }





    public static void main(String[] jc){
//        One();
//        Two();
//        Three();
//        Four();
        Five();


    }


}
