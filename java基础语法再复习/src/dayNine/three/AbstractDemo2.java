package dayNine.three;

/*
抽象类成员特点：
    成员变量：
          可以是变量，亦可以是常量

    构造方法：
			有构造方法，但是不能实例化。（抽象类肯定不能实例化）
			问题：构造方法有什么用呢?
				用于子类访问父类数据的初始化

    成员方法：
        抽象方法：强制要求子类做某些事情。（子类继承抽象类之后，必须实现所有的抽象方法）
        非抽象方法：用于给子类直接使用。


两个小问题：
	1：一个类如果没有抽象方法，可不可以定义为抽象类?如果可以，有什么意义?
		可以。
		为了不让别人创建对象。
	2：abstract不能和哪些关键字共存
		final: final修饰的方法不能被重写，而abstract修饰的方法要求必须被重写。
		private：private修饰的方法不能被重写，而abstract修饰的方法要求必须被重写。

		static：static修饰的方法可以通过类名调用，而abstract修饰的方法是没有方法体的，
				调用一个没有方法体的方法是没有任何意义的，所以不能共存。



 */

abstract class Animal{
//    成员变量
        int num=10;
        final int num2=20;

//        构造方法
        public Animal(){}

//    成员方法
//    具体方法
        public void concretemethod(){
            System.out.println("contretemethod！");
        }
//     抽象方法
        public abstract void abstractfunction();

}


//继承抽象动物类
class ContreteDog extends Animal{

    @Override
    public void concretemethod() {
        System.out.println("我把父类的具体方法也重写了！");

    }

    //    重写父类的抽象类方法
    @Override
    public void abstractfunction() {


    }
}








public class AbstractDemo2 {

    public static void main(String[] args){
        Animal animal=new ContreteDog();
        animal.concretemethod();


    }

}
