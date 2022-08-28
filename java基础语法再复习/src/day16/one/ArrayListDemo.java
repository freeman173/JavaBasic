package day16.one;


/*

 我们在哪些地方使用泛型呢?
 * 		一般就是在集合中常见。查看API，如果类，抽象类，接口后面跟的有<?>就说明要用泛型。
 *
 * 泛型的好处：
 * 		A:提高了程序的安全性
 * 		B:将运行期遇到的问题转移到了编译期
 * 		C:省去了类型强转的麻烦


 *泛型高级：
 *泛型通配符<?>
 *		任意类型，如果没有明确，那么就是Object以及任意的Java类了
 *? extends E
 *		向下限定，E及其子类
 *? super E
 *		向上限定，E及其父类

 */


import java.util.ArrayList;
import java.util.Collection;


//普通工具使用类
class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class ArrayListDemo {
    public static void main(String[] args) {


        //泛型的简单案例
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("jc");
        arrayList.add("lq");

//        泛型通配符:向下通配
        Collection<? extends Animal> c5=new ArrayList<Animal>();
        Collection<? extends Animal> c6=new ArrayList<Dog>();

        //        泛型通配符:向上通配
        Collection<? super Animal> c7=new ArrayList<Animal>();
        Collection<? super Animal> c8=new ArrayList<Object>();









        System.out.println("ok");





    }



}
