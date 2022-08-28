package day17.one;

/*
Set集合(理解)
    (1)Set集合的特点
		无序，唯一
	(2)HashSet集合(掌握)
		A:元素唯一
		B:如何保证元素唯一呢?
			HashSet集合的底层数据结构是哈希表。
			哈希表保证元素唯一性依赖两个方法：hashCode()和equals()
			步骤：
				a:首先判断对象的哈希值是否相同
				b:如果不同，就直接添加到集合
				  如果相同，就继续执行equals()进行比较
				c:如果返回false，就直接添加到集合
				  如果返回true，说明元素重复，不添加。
		C:不用担心
			遇到HashXxx格式的集合，要记住重写两个方法即可。并且，这两个方法是可以自动生成的
	(3)LinkedHashSet
		底层数据结构是哈希表和链表。
		由哈希表保证元素的唯一性。
		由链表保证元素的有序。(存储顺序和取出顺序一致)
	(4)TreeSet集合(理解)
		底层数据结构是红黑树，平衡二叉树
		A:元素唯一，并按照要求排序
		B:如何保证元素唯一的呢?
			根据比较的返回值是否是0来判断
		C:如何保证元素排序的呢?
			两种方式
				a:自然排序(元素具备比较性)
					让元素所属的类实现Comparable接口
				b:比较器排序(集合具备比较性)
					创建集合对象的时候，接受Comparator接口的实现类对象作为构造参数




 * HashSet：不保证 set 的迭代顺序，特别是它不保证该顺序恒久不变。

 * LinkedHashSet：底层数据结构是哈希表和链表。
 * 哈希表：能够保证元素的唯一性
 * 链表：能够保证元素有序

 TreeSet:底层数据结构是二叉树。
 * 可以让元素排序，有两种方案，分别是：自然排序，以及Comparator(比较器)进行排序,具体使用哪种情况看你使用的构造方法。








 */


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {

        Set<String> set= new LinkedHashSet<String>();





    }


}
