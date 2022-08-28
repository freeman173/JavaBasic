package dayNine.one;


/*
如何访问子类特有功能呢?

    创建子类对象

    多态的转型问题:
                向上转型:
                    从子到父
                    父类引用指向子类对象
                向下转型:
                    从父到子
                    父类引用转为子类对象

 */




public class DuoTaiDemo2 {
    public static void main(String[] args){

//向上转型
        Animal a=new Dog();
        a.eat();

//        向下转型：访问子类的特有功能
        Dog d=(Dog)a;
        d.eat();
        d.lookDoor();

// 在同一个父类引用的基础上，接着向上转型
        a=new Cat();
        a.eat();












        System.out.println("--------------------------------");

    }




}
