package com.jc.jihe;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import com.jc.Project03.view.TSUtility;
import com.jc.bijiaoqi.Goods;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
@author 蒋超
@since version-1.0
@date 2023/2/24 21:04
@description :
        集合相关操作：


*/
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class Student implements Comparable{
    private String name;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student student=(Student) o;//向下转型
            if (this.getScore()>student.getScore()){
                return -1;
            }else if (this.getScore()<student.getScore())return 1;
            else return 0;
        }
        throw new RuntimeException("传入数据类型不一致");//运行时异常可以不处理。
    }
}


public class Demo1 {

    /*
        集合常用方法差不多就这些了，其余的用到时再查就行。

    */
    public static void One(){
        Collection collection=new ArrayList();
        ArrayList arrayList=new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        Object o1=collection.toArray();
        Object o2=collection.contains(1);
        System.out.println("___________");

    }

    /*
      迭代器的使用:了解一下就行。
  */
    public static void Two(){
        List<Integer> list=new ArrayList();
        list.add(1);list.add(2);list.add(3);

        Iterator<Integer> integerIterable= list.iterator();//获取迭代器
        while(integerIterable.hasNext()){//判断下一个位置是否有元素
            System.out.println(integerIterable.next());//到下一个位置获取元素
        }
        list.remove(1);
        System.out.println("______________");

    }

    /*
           foreach：可以代替Iterator迭代器，它的底层实现就是Iterator迭代器，
       只能用于遍历集合或数组。

       */

    public static void Three(){
        int[] array=new int[]{1,3,4,5,6,67,7,10};
        for(Object o:array) System.out.print(o+"\t");


    }

     /*

          set：

       */

    public static void Four(){
       Set set=new TreeSet();
       set.add(1000);set.add(10);set.add(100);set.add(99);
        System.out.println("——————————————————");

    }



 /*
          hashmap
       */

    public static void Five(){
       HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
       hashMap.put("蒋超",100);
       hashMap.put("正林",90);
       hashMap.put("刘琪",89);
//       hashMap.put(null,null);
       hashMap.put(null,59);

//       获取hashmap的各项值
       Set set=hashMap.keySet();
       Collection collection=hashMap.values();
       Set entryset=hashMap.entrySet();
//       Collections.sort();
//       使用foreach遍历hashmap
       for (Map.Entry<String, Integer> entry: hashMap.entrySet()) {
            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
        }



       System.out.println("_____________");
    }



    /*
        将输入的整数保存至list中，并按照倒序的顺序显示出来！

    */

    public static void Six(){
        List<Integer> integerList=new ArrayList<>();
        for(int i=0;i<10;i++){
            System.out.println("请输入一个整数:");
            integerList.add(TSUtility.readInt());//借助一个工具类输入即可

        }
        integerList.sort(Comparator.reverseOrder());//对其进行排序，原理暂时不想了解！


        System.out.println("_____________");
    }



 /*
        将学生姓名录入到集合(TreeSet)中，并按照成绩显示前三名的成绩：
            重写了Student中的比较方法，就实现了功能：
                    原理不是很懂，后面有需要再来详细了解！
    */
    public static void Seven(){
        TreeSet<Student> treeSet=new TreeSet<Student>();
        treeSet.add(new Student("1",78));
        treeSet.add(new Student("2",99));
        treeSet.add(new Student("3",90));
        treeSet.add(new Student("4",89));
        treeSet.add(new Student("5",88));
        treeSet.add(new Student("6",100));
        int count=0;
        for (Student s:treeSet){
            if(count==3) break;
            System.out.println(s);
            count++;

        }

        System.out.println("_____________");
    }



    public static void Eight(){
        Queue queue=new ArrayDeque();
        queue.add(1);


    }

    public static void Nine(){
        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();
        HashMap hashMap =new HashMap();

    }


    public static void main(String[] DD){
        Seven();


    }

}