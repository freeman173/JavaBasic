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
@author ����
@since version-1.0
@date 2023/2/24 21:04
@description :
        ������ز�����


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
            Student student=(Student) o;//����ת��
            if (this.getScore()>student.getScore()){
                return -1;
            }else if (this.getScore()<student.getScore())return 1;
            else return 0;
        }
        throw new RuntimeException("�����������Ͳ�һ��");//����ʱ�쳣���Բ�����
    }
}


public class Demo1 {

    /*
        ���ϳ��÷���������Щ�ˣ�������õ�ʱ�ٲ���С�

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
      ��������ʹ��:�˽�һ�¾��С�
  */
    public static void Two(){
        List<Integer> list=new ArrayList();
        list.add(1);list.add(2);list.add(3);

        Iterator<Integer> integerIterable= list.iterator();//��ȡ������
        while(integerIterable.hasNext()){//�ж���һ��λ���Ƿ���Ԫ��
            System.out.println(integerIterable.next());//����һ��λ�û�ȡԪ��
        }
        list.remove(1);
        System.out.println("______________");

    }

    /*
           foreach�����Դ���Iterator�����������ĵײ�ʵ�־���Iterator��������
       ֻ�����ڱ������ϻ����顣

       */

    public static void Three(){
        int[] array=new int[]{1,3,4,5,6,67,7,10};
        for(Object o:array) System.out.print(o+"\t");


    }

     /*

          set��

       */

    public static void Four(){
       Set set=new TreeSet();
       set.add(1000);set.add(10);set.add(100);set.add(99);
        System.out.println("������������������������������������");

    }



 /*
          hashmap
       */

    public static void Five(){
       HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
       hashMap.put("����",100);
       hashMap.put("����",90);
       hashMap.put("����",89);
//       hashMap.put(null,null);
       hashMap.put(null,59);

//       ��ȡhashmap�ĸ���ֵ
       Set set=hashMap.keySet();
       Collection collection=hashMap.values();
       Set entryset=hashMap.entrySet();
//       Collections.sort();
//       ʹ��foreach����hashmap
       for (Map.Entry<String, Integer> entry: hashMap.entrySet()) {
            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
        }



       System.out.println("_____________");
    }



    /*
        �����������������list�У������յ����˳����ʾ������

    */

    public static void Six(){
        List<Integer> integerList=new ArrayList<>();
        for(int i=0;i<10;i++){
            System.out.println("������һ������:");
            integerList.add(TSUtility.readInt());//����һ�����������뼴��

        }
        integerList.sort(Comparator.reverseOrder());//�����������ԭ����ʱ�����˽⣡


        System.out.println("_____________");
    }



 /*
        ��ѧ������¼�뵽����(TreeSet)�У������ճɼ���ʾǰ�����ĳɼ���
            ��д��Student�еıȽϷ�������ʵ���˹��ܣ�
                    ԭ���Ǻܶ�����������Ҫ������ϸ�˽⣡
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