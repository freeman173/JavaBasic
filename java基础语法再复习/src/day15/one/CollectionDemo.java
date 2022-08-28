package day15.one;


/*
为什么会出现集合类？
    java是一门面向对象的语言。有时候需要对多个对象进行操作，所以就出现了集合类。（对象数组操作多个对象有局限性）

集合类特点：
    长度可变；只能存储对象；可以存储不同类型的对象

集合与数组的区别：
    集合长度可变；集合只能存储引用类型；集合可以存储不同的引用类型
    数组长度固定；数组还可以存储基本类型；一个特定数组只能存储同一种类型元素


多种需求，多种集合类型。集合类的本质区别：底层的数据结构不同


迭代器：
 * Iterator iterator()
 * 		boolean hasNext():是否有下一个元素
 * 		Object next():获取下一个元素,并自动移动到下一个位置等待
//上面两个接口配对使用



 * Collection
 *	 	List:元素有序(存储顺序和取出顺序一致),元素可重复。
 *		Set:元素无序,元素唯一
 * 需求：用List集合存储字符串并遍历。




集合的继承体系结构
		多种集合类的数据结构不同，但是功能相似，所以，我们不断的向上抽取，就形成了集合的继承体系结构
			Collection
				|--List
					|--ArrayList
					|--Vector
					|--LinkedList
				|--Set
					|--HashSet
					|--TreeSet

		面对这样的继承体系结构,我们该学习谁,使用谁呢?
			学习：顶层，因为顶层定义的是共性功能。
			使用：底层，因为底层才是具体的实现类，并且具有最多的功能。








 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
//        创建了一个list集合并添加元素
//        Collection c=new ArrayList();
//        c.add("hello");
//        c.add("world");
//        c.add("java");

//        迭代器的使用
//        Iterator iterator=c.iterator();
//        while(iterator.hasNext()){
//
//
//            System.out.println(iterator.next());
//            System.out.println("----————————————");
//
//
//        }


//
        ArrayList<String> stringArrayList=new ArrayList<String>();










        System.out.println("OK");




    }


}
