package day13.one;

/*

需求：我给出了一个数据，我要判断这个数据是不是在int范围呢?肿么办呢?
那么，有没有比较简单的方式让我们来实现这样的需求呢?有。
 * 而基本类型是做不到的，因为基本类型没有功能可以使用。所以，这种的操作最好是能有功能实现。
 * 然后我们调用功能即可。
 * 为了简化我们针对基本类型数据的更复杂的操作，java就针对每种基本类型提供了一个包装类类型，基本类型包装类。
 * byte		Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean


* Integer的构造方法：
    * Integer(int value)： 把int类型的值包装成Integer类型
    * Integer(String s): 把数字类型的字符串转换成Integer类型


* int和String类型的相互转换即可。
 *
 * int -- String
 * 		Integer.toString(number)

 * String -- int
 * 		Integer.parseInt(s);


 * JDK5的新特性：
 * 		自动装箱:int -- Integer
 * 				底层方法：public static Integer valueOf(int i)
 * 		自动拆箱：Integer -- int
 * 				底层方法：public int intValue()
 * 注意：对象不能为null。







 */

public class IntergerDemo {

    public static void main(String[] args){

////    * Integer(int value)： 把int类型的值包装成Integer类型
//        int number=100;
//        Integer i=new Integer(number);
////                * Integer(String s): 把数字类型的字符串转换成Integer类型
//        String s="100";
//        Integer i2=new Integer(s);

//        Integer a=100;
//        System.out.println((a));

////        整形转字符串
//        int number = 100;
//        String s4 = Integer.toString(number);

//        字符串转整形
//        String s = "100";
//        int num2 = Integer.parseInt(s);

//自动装拆箱
        Integer i=100;//自动装箱为对象

        int n=i;//





        System.out.println("ok");





    }


}
