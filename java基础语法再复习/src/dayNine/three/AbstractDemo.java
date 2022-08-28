package dayNine.three;
/*
抽象类概述：动物不是一个具体的事物，只有猫，狗才是具体的个体。
				并且，在动物中我们针对吃的功能，也不应该给出具体的体现，
				因为不同的动物吃的内容是不一样的，我们应该让具体的动物自己去实现自己吃的功能。
				而一个功能如果没有具体的体现，就是一个抽象的内容。如何表示呢?

				格式：
					修饰符 返回值类型 方法名(参数列表...);

				为了表示这是一个抽象的东西，java提供了一个标识的关键字：abstract

				格式：
					修饰符 abstract 返回值类型 方法名(参数列表...);
				而一个类中的方法如果是抽象的类，那么，该类就必须定义为抽象类。

其特点：
    抽象类和抽象方法必须用abstract关键字修饰。
    抽象类的子类：
			a:要么是抽象类
			b:要么重写抽象类中的所有抽象方法
    抽象类不能实例化：
			那么如何使用抽象类的功能呢?
			按照多态的方式使用。抽象类多态。



回顾：
    多态前提为什么要有方法重写？
        因为父类可能抽象

 */


abstract class AbstractAnimal{
//    有方法体，只是内容为空
//    public void eat(){}
    public abstract void eat();

}

//抽象子类继承抽象类
abstract class Dog extends AbstractAnimal{

}

class ConcreteCat extends AbstractAnimal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼即可！");
    }
}



public class AbstractDemo {

    public static void main(String[] args){



//        实现抽象类多态
        AbstractAnimal abstractAnimal=new ConcreteCat();
        abstractAnimal.eat();






    }


}
