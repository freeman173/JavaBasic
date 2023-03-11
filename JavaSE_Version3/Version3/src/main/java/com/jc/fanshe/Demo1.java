package com.jc.fanshe;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
@author ����
@since version-1.0
@date 2023/3/6 22:46
@description :
        ����
*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sun.reflect.Reflection;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
class Person implements Serializable {
    private static final String vname="����";
    private String name="����";
    private int age=25;

    private Person(String name){
        name=name;
    }

    @Override
    public String toString() {
        System.out.println( "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');
        return null;
    }
}


class Jc extends Person{
    public Jc(){
        super("����",25);
    }

    private void play(){
        System.out.println(this.getName()+"ϲ����ƹ������ë��");
    }

}

public class Demo1 {


        /*
            �����������
        */
    public static void One() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        ��������ʱ��������ⲿ���ܵ������˽�нṹ
//        Person person=new Person("jiangchao");
//        Class stuClass=Class.forName("com.jc.fanshe.Person");

//        �õ�Class����
        Class<Person> personClass = Person.class;

//        ���ù��췽������
        Constructor<Person> personConstructor=personClass.getConstructor(String.class,int.class);
        Person person=personConstructor.newInstance("����",25);

//        ����˽�����Զ���
        Field age=personClass.getDeclaredField("age");
        age.setAccessible(true);//����˽������ʱ����Ҫ����һ��Ȩ�ޡ�
        age.set(person,10);

//        ���÷�������
        Method method=personClass.getMethod("toString");
        method.invoke(person);


        System.out.println("______________");
    }



    /*
        ��������̬�ش���һ������
    */
    public static <classType> void Two() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

//        ���������ļ�
        Properties pro=new Properties();
        ClassLoader classLoader= Demo1.class.getClassLoader();
        InputStream inputStream=classLoader.getResourceAsStream("pro.properties");
        pro.load(inputStream);


//        2����ȡ�������ļ���������Ϣ
        String className= pro.getProperty("className");
        String methodName=pro.getProperty("methodName");
        String classType=pro.getProperty("classType");

//        �õ�����࣬������
        Class<classType> jcClass= (Class<classType>) Class.forName("com.jc.fanshe.Jc");

//        �õ����������������
        Constructor<classType> classTypeConstructor= jcClass.getConstructor();
        Object o=classTypeConstructor.newInstance();

//        ����˽�з�����
        Method method=jcClass.getDeclaredMethod("play");
        method.setAccessible(true);
        method.invoke(o);


        System.out.println("_____________");

    }



    /*
        ��ȡclassʵ����4�ַ�ʽ
    */
    public static void Three() throws ClassNotFoundException {

//        1.��������ʱ�������
        Class<Jc> jcClass=Jc.class;

//        2.��������ʱ��Ķ���
        Jc jc=new Jc();
        Class<Jc> jcClassTwo= (Class<Jc>) jc.getClass();


//        3.����class�ľ�̬����
        Class<Jc> jcClassThree= (Class<Jc>) Class.forName("com.jc.fanshe.Jc");


//       4��ʹ������������˽⼴�ɣ�


        Class<Class> classClass = Class.class;
         System.out.println("������������������������������������������������");



    }



    /*
        ͨ����Class���鿴��ĸ�����ɣ�
    */
    public static void Four() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> jcClass= (Class<Person>) Class.forName("com.jc.fanshe.Person");

        Constructor<Person>[] constructors= (Constructor<Person>[]) jcClass.getDeclaredConstructors();

        Field[] fields=jcClass.getDeclaredFields();

        Method[] methods= jcClass.getDeclaredMethods();

//        ��ȡ�ӿ�
        Class[] interfaces=jcClass.getInterfaces();
//��ȡ��
        Package p=jcClass.getPackage();




        System.out.println("_______________");

    }



    public static void main(String[] DD) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException, IOException {

//        One();
//        Two();
//        Three();
        Four();
    }
}