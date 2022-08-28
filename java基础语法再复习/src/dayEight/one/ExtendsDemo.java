package dayEight.one;

/*
Java继承：
    单继承；多层继承。


    继承注意事项：
        子类只能继承父类所有非私有成员；
        子类不能继承父类的的构造方法，但可以通过super关键字去访问父类构造方法。



 */
class Fu{

    private Integer num=100;
    public Integer num2=200;

    private void show(){ System.out.println("私有变量:"+num);}

    public void show2(){

        show();
        System.out.println("公有变量:"+num2);}



}
//继承一手
class Zi extends Fu{}







public class ExtendsDemo {
    public static void main(String[] args){

        Zi z=new Zi();
//        只能访问公有
        z.show2();




    }





}
