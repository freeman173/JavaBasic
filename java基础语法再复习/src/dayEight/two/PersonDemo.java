package dayEight.two;

/*
override：
    重写：子类中出现和父类中一模一样的方法声明。
overload：
    重载：同一个类中出现的方法名相同，但是参数列表不同的现象。





方法重写注意事项：
	A:父类中私有方法不能被重写
	B:子类重写父类方法时，访问权限不能更低
			建议一样即可。
	C:父类静态方法，子类也必须通过静态方法进行重写。


@Override:
    1. 可以告诉读你代码的人，这是对它父类方法的重写，其实很多代码规范没有为什么，规范就是规范，代码的可读性还是很重要的。
    2. 编译器可以给你验证@Override下面的方法名称是否是你父类中所有的，如果没有就会报错。




 */

class Person{
    public void show(){System.out.println("show person");}
//    private void show2() {System.out.println("show2 person");}
    public void show3() {
        System.out.println("show3 person");
    }
//    public static void show4() {
//        System.out.println("show4 person");
//    }

}

class Student extends Person{
    @Override
    public void show() {System.out.println("show student");}
//    private void show2(){System.out.println("show2 student");}
    @Override
    public void show3(){System.out.println("show3 student");}

//    @Override
//    public static void show4() {
//        System.out.println("show4 student");
//    }

}

public class PersonDemo {
  public static void  main(String[] args){
      Student s = new Student();
      s.show();
//      s.show2();
      s.show3();
//      s.show4();


  }






}

