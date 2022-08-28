package dayEight.three;








class Animal{

    private String name;
    private Integer age;

    public Animal(){}
    public Animal(String name,Integer age){
        this.name=name;
        this.age=age;
    }

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

    public void show() {
        System.out.println(name+":"+age);
    }


}


class Cat extends Animal{
//    子类的构造函数
    public Cat(){}
    public Cat(String name ,Integer age){
        super(name,age);
    }

    public void catchMouse(){System.out.println("猫捉老鼠");}

}

class Dog extends Animal{
    public Dog(){}
    public Dog(String name ,Integer age){
        super(name,age);
    }

    public void catchMouse(){System.out.println("狗拿耗子，多管闲事");}


}


class TestDemo{
    public static void main(String[] args){



    }


}





























public class AnimalDemo {
}
