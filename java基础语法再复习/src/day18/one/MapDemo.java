package day18.one;

/*
* Map：元素是按照键值对形式存储的。每一对元素由两部分组成。分别叫键和值
 * 	          键是唯一的，值是可以重复的。
 * 	         所以Map集合的底层数据结构是针对键有效，跟值无关。

  Map接口和Collection接口的不同?(面试题)
 * 		A:Map集合是双列集合；Map集合的键是唯一的，值是可以重复的。其实我们也可以简单的理解为Map集合的键和值是由Set和List组成；数据结构针对键有效。
 * 		B:Collection集合是单列集合；Collection集合的儿子Set是唯一的，List是可以重复的；数据结构针对元素有效。

*
*
* Map集合的遍历:
   * 见代码

* 几种常见map：

    HashMap
		HashMap<String,String>
		HashMap<Integer,String>
		HashMap<String,Student>
		HashMap<Student,String>
	LinkedHashMap
		键有序，唯一
	TreeMap
		TreeMap<String,String>
		TreeMap<Student,String>



 * 面试题:
 * 1:HashMap和Hashtable的区别？
 * A:HashMap是线程不安全的，效率高。允许使用 null 值和 null 键。
 * B:Hashtable是线程安全的，效率低。不允许使用 null 值和 null 键。
 *
 *
 *
 *
 *
 * 2:List,Set,Map等接口是否都继承自Map接口
 * List,Set都继承自Collection接口。
 * Map本身就是顶层接口
 *
 *
 *
 * 3:你常见的集合类有哪些，都有什么方法？
 * 		Collection
 * 			|--List
 * 				|--ArrayList
 * 				|--Vector
 * 				|--LinkedList
 * 			|--Set
 * 				|--HashSet
 * 					|--LinkedHashSet
 * 				|--TreeSet
 * 		Map
 * 			|--HashMap
 * 				|--LinkedHashMap
 * 			|--Hashtable
 * 			|--TreeMap
 *
 * 		ArrayList
 * 			添加功能，移除功能，判断功能，获取，长度
 * 		HashSet
 * 			添加功能，移除功能，判断功能，获取，长度
 * 		HashMap
 * 			添加功能，移除功能，判断功能，获取，长度
 *
 *
 2:Collections(理解)
	(1)Collections是针对集合进行操作的工具类
	(2)面试题：Collection和Collections的区别
		A:Collection是单例集合的顶层接口，定义了单例集合的共性功能
		B:Collections是针对集合进行操作的工具类
	(3)Collections常见功能(自己补齐方法名称)
		A:排序
		B:二分查找
		C:最大值
		D:反转
		E:随机置换
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args){

////        初始化并赋值
//        Map<String,Integer> map=new HashMap<String,Integer>();
//        map.put("蒋超",100); map.put("刘琪",90); map.put("六涛",80);
//        map.put("正林",70); map.put("思君",60); map.put("景辉",50);
//
////        拿到map的所有key形成set，并遍历得到值
//        Set<String> set=map.keySet();
//        for(String key:set){
//            Integer value=map.get(key);
//            System.out.println(key+":"+value);
//        }
//
//
////        拿到map的所有键值对对象的set集合
//        Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
//        for(Map.Entry<String, Integer> a: entrySet) {
//            String key=a.getKey();
//            Integer value=a.getValue();
//            System.out.println(key+":"+value);
//
//        }








    }


}
