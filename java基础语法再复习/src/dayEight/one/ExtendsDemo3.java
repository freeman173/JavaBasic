package dayEight.one;

/*

继承中的构造方法：
        子类中所有的构造方法默认都会访问父类中空参数的构造方法；因为
     因为子类会继承父类中的数据，可能还会使用父类的数据。


     那么，我可不可以访问父亲的带参构造方法呢?
		可以。通过super(...)


    如果父类没有无参构造方法，那么，我们只能
			a:通过super去访问父类的带参构造方法。
			b:通过this去访问本类的其他构造方法。



继承的好处：
		A:提高了代码的复用性
		B:提高了代码的维护性
		C:让类与类之间产生了关系，是多态的前提


继承的弊端：类的耦合性很强
		设计原则：低耦合，高内聚。
		耦合：类与类的关系。
		内聚：自己完成事情的能力。







 */




class Person{
//    类成员
    private String name;
    private Integer age;

//    给出构造函数（无参、有参都给出）
    Person(){}
    Person(String name,Integer age){
        this.age=age;
        this.name=name;
    }

//    常规类函数
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

}


//学生类
class Student extends Person{
//    给出构造函数
    Student(){}
    Student(String name ,Integer age){super(name,age);}

}


//老师类
class Teacher extends Person{}




public class ExtendsDemo3 {
    public static void main(String[] args){
//        学生类

//调用了本类的的无参构造函数，本类的无参构造函数又默认地去调用了父类的无参构造函数；
        Student s=new Student();
//        无参构造函数并不能给属性赋具体值，所以只能借助set方法
        s.setName("蒋超");
        s.setAge(27);
        System.out.println(s.getName()+"---"+s.getAge());
        s.eat();
        s.sleep();
        System.out.println("--------------------------");

//调用了本类的的有参构造函数,本类的有参构造函数又去调用了父类的有参构造函数；
        Student s2 = new Student("王宝强",18);
        System.out.println(s2.getName()+"---"+s2.getAge());
        s2.eat();
        s2.sleep();
        System.out.println("--------------------------");



//老师类的无参构造函数是系统自动给出的
        Teacher t = new Teacher();
        t.setName("王祖蓝");
        t.setAge(25);
        System.out.println(t.getName()+"---"+t.getAge());
        t.eat();
        t.sleep();






//        System.out.println("OK");




    }






}
