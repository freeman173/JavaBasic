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
@author 蒋超
@since version-1.0
@date 2023/3/6 22:46
@description :
        反射
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
    private static final String vname="超人";
    private String name="蒋超";
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
        super("蒋超",25);
    }

    private void play(){
        System.out.println(this.getName()+"喜欢打乒乓球、羽毛球！");
    }

}

public class Demo1 {


        /*
            反射基本操作
        */
    public static void One() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        正常操作时，在类的外部不能调用类的私有结构
//        Person person=new Person("jiangchao");
//        Class stuClass=Class.forName("com.jc.fanshe.Person");

//        得到Class对象
        Class<Person> personClass = Person.class;

//        调用构造方法对象
        Constructor<Person> personConstructor=personClass.getConstructor(String.class,int.class);
        Person person=personConstructor.newInstance("蒋超",25);

//        调用私有属性对象
        Field age=personClass.getDeclaredField("age");
        age.setAccessible(true);//调用私有属性时，需要设置一个权限。
        age.set(person,10);

//        调用方法对象
        Method method=personClass.getMethod("toString");
        method.invoke(person);


        System.out.println("______________");
    }



    /*
        根据需求动态地创建一个对象
    */
    public static <classType> void Two() throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

//        加载配置文件
        Properties pro=new Properties();
        ClassLoader classLoader= Demo1.class.getClassLoader();
        InputStream inputStream=classLoader.getResourceAsStream("pro.properties");
        pro.load(inputStream);


//        2、获取到配置文件的配置信息
        String className= pro.getProperty("className");
        String methodName=pro.getProperty("methodName");
        String classType=pro.getProperty("classType");

//        得到类的类，哈哈！
        Class<classType> jcClass= (Class<classType>) Class.forName("com.jc.fanshe.Jc");

//        拿到构造器并构造对象
        Constructor<classType> classTypeConstructor= jcClass.getConstructor();
        Object o=classTypeConstructor.newInstance();

//        调用私有方法。
        Method method=jcClass.getDeclaredMethod("play");
        method.setAccessible(true);
        method.invoke(o);


        System.out.println("_____________");

    }



    /*
        获取class实例的4种方式
    */
    public static void Three() throws ClassNotFoundException {

//        1.调用运行时类的属性
        Class<Jc> jcClass=Jc.class;

//        2.调用运行时类的对象
        Jc jc=new Jc();
        Class<Jc> jcClassTwo= (Class<Jc>) jc.getClass();


//        3.调用class的静态方法
        Class<Jc> jcClassThree= (Class<Jc>) Class.forName("com.jc.fanshe.Jc");


//       4、使用类加载器（了解即可）


        Class<Class> classClass = Class.class;
         System.out.println("————————————————————————");



    }



    /*
        通过“Class”查看类的各个组成！
    */
    public static void Four() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> jcClass= (Class<Person>) Class.forName("com.jc.fanshe.Person");

        Constructor<Person>[] constructors= (Constructor<Person>[]) jcClass.getDeclaredConstructors();

        Field[] fields=jcClass.getDeclaredFields();

        Method[] methods= jcClass.getDeclaredMethods();

//        获取接口
        Class[] interfaces=jcClass.getInterfaces();
//获取包
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