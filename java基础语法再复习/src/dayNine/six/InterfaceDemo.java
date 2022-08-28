package dayNine.six;

/*
接口概述：现在在动物园里面，有些猫可以钻火圈，狗跳高，做计算等东西。
			  而这些动作，并不是动物天生就就具备的，所以，不适合定义在动物类中。
			  并且，也不是所有的猫，或者狗具备这些功能，所以直接定义在猫或者狗类中也不合适。
			  针对这样的一种扩展功能，java就提供了接口来体现。


特点:
    接口用关键字interface表示；类实现接口用implements表示。
    接口不能实例化。
    接口的子类：
			a:要么是抽象类
			b:要么重写接口中的所有的抽象方法



接口类的成员特点：
    成员变量：
        必须是静态常量

    无构造方法

    成员方法：
        只能是抽象的


类与接口的关系：
    类与类：
            继承关系，只能单继承。可以多层继承。
    类与接口：
            实现关系，可以单实现，也可以多实现。
            还可以在继承一个类的同时实现多个接口。
    接口与接口：
            继承关系，可以单继承，也可以多继承。


抽象类与接口的区别：
    1：成员区别
        抽象类：
            成员变量：可以是变量，也可以是常量
            构造方法：有
            成员方法：可以是抽象的，也可以是非抽象的
        接口：
            成员变量：只能是常量。
                默认修饰符：public static final
            成员方法：只能是抽象的
                默认修饰符：public abstract

    2：关系区别
        类与类：
            继承关系，只能单继承。可以多层继承。
        类与接口：
            实现关系，可以单实现，也可以多实现。
            还可以在继承一个类的同时实现多个接口。
        接口与接口：
            继承关系，可以单继承，也可以多继承。

    3：设计理念区别
        抽象类：被继承体现的是：”is a”的关系。在抽象类中定义的一般是共性功能
        接口：被实现体现的是：”like a”的关系。在接口中定义的一般是扩展功能



 */


interface Animal{

    public static final int num=10;

    public abstract void show();

}

class Dog_Interface implements Animal{

    @Override
    public void show() {
        System.out.println("我重写了接口的抽象方法并调用了其中的常量:"+Animal.num);
    }
}



public class InterfaceDemo {


    public static void main(String[] args){

        Dog_Interface dog_interface=new Dog_Interface();
        dog_interface.show();


    }


}
