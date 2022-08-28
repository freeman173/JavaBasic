package dayNine.one;

/*
   多态的好处：
		A:提高了程序的维护性(由继承保证)
		B:提高了程序的扩展性(由多态保证)

	多态的弊端：
		不能访问子类特有的功能。
 */


class Animal{
    public void eat(){System.out.println("动物吃饭！");}
}


//狗继承了父类并且有自己的新功能
class Dog extends Animal{
    public void eat(){System.out.println("狗吃肉！");}
    public void lookDoor() {
        System.out.println("狗知道看门");
    }
}

class Cat extends Animal {
    public void eat(){
        System.out.println("猫吃鱼");
    }

}






public class DuoTaiDemo {

    public static void main(String[] args){

//        创建两个子类对象
        Animal animal_one=new Dog();
        Animal animal_two=new Cat();

//        不同的动物不同的吃法
        animal_one.eat();
        animal_two.eat();



    }












}
