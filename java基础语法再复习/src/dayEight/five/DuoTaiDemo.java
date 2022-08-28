package dayEight.five;

/*
多态(掌握):
	(1)多态：同一个对象，在不同时刻表现出来的多种状态
		举例：水，猫和动物
	(2)多态的前提：
		A:有继承关系
		B:有方法重写
		C:有父类引用指向子类对象

	(3)多态中的成员访问特点：
		A:成员变量
			编译看左边，运行看左边
		B:成员方法
			编译看左边，运行看右边
		C:静态方法
			编译看左边，运行看左边

		为什么：
			因为方法有重写，而变量没有。静态方法没有重写一说。

 */

class Animal{
    public int age =30;

    public void show(){ System.out.println("show animal");}
    public static void method(){System.out.println("method animal");}
}

class Dog extends Animal {

    public int age = 20;

    public void show() {
        System.out.println("show dog");
    }

    public static void method() {
        System.out.println("method dog");
    }

}

public class DuoTaiDemo {
    public static void main(String[] args) {

            Animal a=new Dog();

            System.out.println(a.age);

            a.show();

            a.method();

    }

}
