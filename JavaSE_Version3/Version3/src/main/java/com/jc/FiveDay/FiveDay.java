package com.jc.FiveDay;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FiveDay {

    /*
    一维数组的初始化
     */
    public static void One(){

/*

        数组的初始化：
          静态与动态初始化的区别就在于，前者是声明的时候就初始化，后者是先声明，再动态初始化。

 */

//        静态初始化
        int[] i1=new int[]{1,2,3,4,5};
//        int[] i1={1,2,3,4,5};
//        动态初始化
        int[] i2=new int[5];


//        string的底层就是通过char[]实现的，后续有需求再深入了解。
        char[] c1=new char[]{'1','2','3','4','5'};
        String s1=new String(c1);



        System.out.println("______________");
    }



    /*
        数组的初始化的默认值
   */
    public static void Two(){

        int[] i1=new int[5];
        double[] d1=new double[5];
        char[] c1=new char[5];
        String[] s1=new String[5];



        System.out.println("______________");
    }


    /*
          一维数组的内存:

     */
    public static void Three(){



        int[] i1=new int[5];//左边为栈中的引用类型变量，右边为堆中的数组内存空间；右边把地址赋给了左边

        System.out.println(i1);




        System.out.println("______________");
    }




    /*
       二维数组的初始化值:
          int[][] i2=new int[3][2]
                i2[0]的值为地址
                i2[0][0]值为0

          int[][] i3=new int[3][];
                i3[0]的值为：null




      */
    public static void Four(){


        int[][] i1=new int[][]{{1,2,3},{4,5},{6,7,8,9,10}};
        int[][] i2=new int[3][2];


/*              这种很经典：表示定义了一个数组引用变量x，第一个元素为x[0],第n个元素变量为x[n-1]。
                x中从 x[0] 到 x[n-1] 的每个元素又是一个整数类型的数组引用变量，并未要求他们所引用
                数组的长度是多少，也就是说每个引用数组的长度可以不一样。
                */

        int[][] i3=new int[3][];
        i3[0]=new int[5];






        System.out.println("______________");
    }



    /*

        数组工具类的使用,

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
