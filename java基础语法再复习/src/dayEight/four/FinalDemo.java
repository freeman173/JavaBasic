package dayEight.four;

/*
很多时候，我们可能不想让子类修改我的内容。这个时候该怎么半呢?
	针对这种情况，java又提供了一个状态修饰符：final。


    作用：
		可以修饰类，成员变量，成员方法。

	特点:
		类：类被final修饰，说明该类是最终类，不能被继承。
		成员变量：变量被final修饰后，就变成了常量。值不能被修改。
		成员方法：方法不能被子类重写。

final修饰局部变量：
		基本类型：基本类型的值不能变量
		引用类型：引用类型的地址值不能改变

        在Java中，基本类型与引用类型的区别：

            java 中一共分为 8 种基本数据类型：byte、short、int、long、float、double、char、boolean。
         简单来说，所有的非基本数据类型都是引用数据类型。Java语言是一个面向对象的语言，但是Java中的基本数据类型却是不面向对象的。
            基本类型在栈中直接存储的具体数值，而包装类型则存储的是堆中的引用（存放着指向具体对象的地址值）。
            相比较于基本类型而言，包装类型需要占用更多的内存空间。假如没有基本类型的话，对于数值这类经常使用到的数据来说，每次都要通过 new 一个包装类型就显得非常笨重。

            既然有了基本类型和包装类型，肯定有些时候要在它们之间进行转换。
        把基本类型转换成包装类型的过程叫做装箱（boxing）。反之，把包装类型转换成基本类型的过程叫做拆箱（unboxing）。




 */



public class FinalDemo {

    public static void main(String[] args){

//        自动装箱：将数值自动包装为Integer类
        Integer chenmo=10;
//        自动拆箱：将Interger中的基本数值自动拆解出来
        int wanger=chenmo;
        System.out.println(chenmo);
        System.out.println(wanger);

        System.out.println("ok");
























    }




}
