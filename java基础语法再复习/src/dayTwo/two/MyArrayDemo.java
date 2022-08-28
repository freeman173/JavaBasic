package dayTwo.two;

import java.util.Scanner;

public class MyArrayDemo {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("请输入三个数据：");
        Integer[] arr;
        Integer i=0;
        arr=new Integer[3];
        System.out.println(arr);

//        数组赋值
        while (true){
            arr[i]=sc.nextInt();
            i++;
            if(i==arr.length){
                break;
            }

        }

//        遍历数组
        for(Integer j=0;j<arr.length;j++){
            System.out.println("arr["+j+"]:"+arr[j]);

        }


//        找出数组的最大值
        Integer temp=0;
        for(Integer j=0;j< arr.length;j++){

            if(arr[j]>temp){
                temp=arr[j];
            }


        }
        System.out.println("数组最大值:"+temp);











    }



}
