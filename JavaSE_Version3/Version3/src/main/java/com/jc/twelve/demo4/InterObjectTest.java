package com.jc.twelve.demo4;

/*
���ڳ�Ա�ڲ����һЩ����:

��̬�ڲ������Ƿ����ֱ�ӷ����ⲿ���ʵ����Ա��
    �����Եģ��ⲿ���ʵ����Ա�������ⲿ�������ʡ�

��Ա�ڲ����ʵ���������Ƿ����ֱ�ӷ����ⲿ���ʵ����Ա��
    ���Ե�



*/


class Person{

    String name="����";
    int age=25;
    public static void run(){
        System.out.println("����һ����̬����");
    }
    public void eat(){
        System.out.println("���˳Է���");
    }

//    ��̬��Ա�ڲ���
    static class Dog{
        String name="���";
        int age;
        public void show(){
            System.out.println("����һ������");

        }
    }

//    �Ǿ�̬��Ա�ڲ���
    class Bird{
        String name="ϲȵ";
        public void sing(){
            System.out.println("����һֻСС��");
//            �����ⲿ��ķǾ�̬����
            Person.this.eat();
//          �����ⲿ��ľ�̬����
            run();
        }


    }
}




public class InterObjectTest {

    public static void main(String[] jc){

//        ����һ����̬�ڲ���
        Person.Dog dog=new Person.Dog();
        dog.show();

        //        ����һ���Ǿ�̬�ڲ���
        Person p=new Person();
        Person.Bird bird=p.new Bird();
        bird.sing();



        System.out.println("_____________");


    }

}
